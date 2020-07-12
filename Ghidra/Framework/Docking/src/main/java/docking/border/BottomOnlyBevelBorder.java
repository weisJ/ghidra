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

/**
 * a bevel border to paint only it's bottom edge, but with the highlight normally found at
 */
public class BottomOnlyBevelBorder extends BevelBorder {
	public BottomOnlyBevelBorder() {
		super(RAISED);
	}

	@Override
	protected void paintRaisedBevel(Component c, Graphics g, int x, int y, int width, int height) {
		Color oldColor = g.getColor();

		g.translate(x, y);

		// bottom outer
		g.setColor(getHighlightOuterColor(c));
		g.drawLine(0, height - 1, width - 1, height - 1);

		// bottom inner         
		g.setColor(getShadowInnerColor(c));

		g.translate(-x, -y);
		g.setColor(oldColor);
	}
}
