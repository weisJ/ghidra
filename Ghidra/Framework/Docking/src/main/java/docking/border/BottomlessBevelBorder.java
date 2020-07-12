/* ###
 * IP: GHIDRA
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package docking.border;

import java.awt.*;

import javax.swing.border.BevelBorder;

// This class doesn't paint the bottom border in order to make the object appear to be
// connected to the component below.  This class also paints its side borders below its
// bounds for the same reason.
public class BottomlessBevelBorder extends BevelBorder {
	public BottomlessBevelBorder() {
		super(RAISED);
	}

	@Override
	// overridden to reduce the space below, since there is no component
	public Insets getBorderInsets(Component c) {
		Insets borderInsets = super.getBorderInsets(c);
		borderInsets.bottom = 0;
		return borderInsets;
	}

	@Override
	protected void paintRaisedBevel(Component c, Graphics g, int x, int y, int width,
			int height) {
		Color oldColor = g.getColor();
		int h = height;
		int w = width;

		g.translate(x, y);

		Shape saveClip = g.getClip();
		Rectangle bounds = saveClip.getBounds();
		g.setClip(bounds.x, bounds.y, bounds.width, c.getHeight() + 2);

		g.setColor(getShadowOuterColor(c));
		g.drawLine(0, 0, 0, h); // left outer
		g.setColor(getHighlightOuterColor(c));
		g.drawLine(1, 0, w - 2, 0); // upper outer

		g.setColor(getHighlightInnerColor(c));
		g.drawLine(1, 1, 1, h); // left inner
		g.drawLine(2, 1, w - 3, 1); // upper inner

		// bottom outer
		g.setColor(getShadowOuterColor(c));
		g.drawLine(w - 1, 0, w - 1, h); // right outer

		// bottom inner
		g.setColor(getShadowInnerColor(c));
		g.drawLine(w - 2, 1, w - 2, h); // right inner

		g.setClip(saveClip);

		g.translate(-x, -y);
		g.setColor(oldColor);

	}
}
