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

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import com.github.weisj.darklaf.components.border.DarkBorders;

public class DarklafBorderProvider implements BorderProvider {

	@Override
	public Border createLineBorder(Color color) {
		return createLineBorder(color, 1);
	}

	@Override
	public Border createLineBorder(Color color, int thickness) {
		if (Color.GRAY.equals(color) || Color.BLACK.equals(color)) {
			return DarkBorders.createLineBorder(thickness, thickness, thickness, thickness);
		}
		return BorderFactory.createLineBorder(color, thickness);
	}

	@Override
	public Border createRaisedSoftBevelBorder() {
		return DarkBorders.createLineBorder(1, 1, 1, 1);
	}

	@Override
	public Border createLoweredSoftBevelBorder() {
		return DarkBorders.createLineBorder(1, 1, 1, 1);
	}

	@Override
	public TitledBorder createTitledBorder(String title) {
		return BorderFactory.createTitledBorder(title);
	}

	@Override
	public TitledBorder createTitledBorder(Border border, String title) {
		return BorderFactory.createTitledBorder(border, title);
	}

	@Override
	public Border createEmptyBorder() {
		return BorderFactory.createEmptyBorder();
	}

	@Override
	public Border createEmptyBorder(int top, int left, int bottom, int right) {
		return BorderFactory.createEmptyBorder(top, left, bottom, right);
	}

	@Override
	public Border createCompoundBorder(Border outsideBorder, Border insideBorder) {
		return BorderFactory.createCompoundBorder(outsideBorder, insideBorder);
	}

	@Override
	public Border createMatteBorder(int top, int left, int bottom, int right, Color color) {
		if (Color.GRAY.equals(color) || Color.BLACK.equals(color)) {
			return DarkBorders.createLineBorder(top, left, bottom, right);
		}
		return BorderFactory.createMatteBorder(top, left, bottom, right, color);
	}

	@Override
	public Border createBottomOnlyBevelBorder() {
		return DarkBorders.createLineBorder(0, 0, 1, 0);
	}

	@Override
	public Border createBottomlessBevelBorder() {
		return DarkBorders.createLineBorder(1, 1, 0, 1);
	}

	@Override
	public Border createRaisedBevelBorder() {
		return DarkBorders.createLineBorder(1, 1, 1, 1);
	}

	@Override
	public Border createEtchedBorder() {
		return DarkBorders.createLineBorder(1, 1, 1, 1);
	}

	@Override
	public Border createEtchedBorder(Color color1, Color color2) {
		return DarkBorders.createLineBorder(1, 1, 1, 1);
	}

	@Override
	public Border createEmptyBorder(Insets ins) {
		return BorderFactory.createEmptyBorder(ins.top, ins.left, ins.bottom, ins.right);
	}

	@Override
	public Border createLoweredBevelBorder() {
		return DarkBorders.createLineBorder(1, 1, 1, 1);
	}

	@Override
	public Border createBevelBorder(int type, Color highlight, Color color) {
		return DarkBorders.createLineBorder(1, 1, 1, 1);
	}

	@Override
	public Border createBevelBorder(int type, Color highlightOuter, Color highlightInner,
			Color shadowOuter,
			Color shadowInner) {
		return DarkBorders.createLineBorder(1, 1, 1, 1);
	}

	@Override
	public Border createTitledBorder(Border border, String title, int justification,
			int defaultPosition) {
		return BorderFactory.createTitledBorder(border, title, justification, defaultPosition);
	}
}