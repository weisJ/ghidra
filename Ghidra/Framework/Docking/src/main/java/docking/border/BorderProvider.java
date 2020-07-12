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

import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public interface BorderProvider {

	Border createLineBorder(Color color);

	Border createLineBorder(Color color, int thickness);

	Border createRaisedSoftBevelBorder();

	Border createLoweredSoftBevelBorder();

	TitledBorder createTitledBorder(String title);

	TitledBorder createTitledBorder(Border border, String title);

	Border createEmptyBorder();

	Border createEmptyBorder(int top, int left, int bottom, int right);

	Border createCompoundBorder(Border outsideBorder, Border insideBorder);

	Border createMatteBorder(int top, int left, int bottom, int right, Color color);

	Border createBottomOnlyBevelBorder();

	Border createBottomlessBevelBorder();

	Border createRaisedBevelBorder();

	Border createEtchedBorder();

	Border createEtchedBorder(Color color1, Color color2);

	Border createEmptyBorder(Insets borderInsets);

	Border createLoweredBevelBorder();

	Border createBevelBorder(int type, Color highlight, Color color);

	Border createBevelBorder(int type, Color highlightOuter, Color highlightInner,
			Color shadowOuter, Color shadowInner);

	Border createTitledBorder(Border border, String title, int justification, int defaultPosition);
}
