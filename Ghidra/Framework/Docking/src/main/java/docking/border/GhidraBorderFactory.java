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

public class GhidraBorderFactory {

	private static BorderProvider borderProvider;

	public static void setBorderProvider(BorderProvider borderProvider) {
		GhidraBorderFactory.borderProvider = borderProvider;
	}

	private GhidraBorderFactory() {
	}

	public static Border createLineBorder(Color color) {
		return borderProvider.createLineBorder(color);
	}

	public static Border createLineBorder(Color color, int thickness) {
		return borderProvider.createLineBorder(color, thickness);
	}

	public static Border createRaisedSoftBevelBorder() {
		return borderProvider.createRaisedSoftBevelBorder();
	}

	public static Border createLoweredSoftBevelBorder() {
		return borderProvider.createLoweredSoftBevelBorder();
	}

	public static TitledBorder createTitledBorder(String title) {
		return borderProvider.createTitledBorder(title);
	}

	public static Border createTitledBorder(Border border, String title, int justification,
			int defaultPosition) {
		return borderProvider.createTitledBorder(border, title, justification, defaultPosition);
	}

	public static TitledBorder createTitledBorder(Border border, String title) {
		return borderProvider.createTitledBorder(border, title);
	}

	public static Border createEmptyBorder() {
		return borderProvider.createEmptyBorder();
	}

	public static Border createEmptyBorder(int top, int left, int bottom, int right) {
		return borderProvider.createEmptyBorder(top, left, bottom, right);
	}

	public static Border createCompoundBorder(Border outsideBorder, Border insideBorder) {
		return borderProvider.createCompoundBorder(outsideBorder, insideBorder);
	}

	public static Border createMatteBorder(int top, int left, int bottom, int right, Color color) {
		return borderProvider.createMatteBorder(top, left, bottom, right, color);
	}

	public static Border createBottomOnlyBevelBorder() {
		return borderProvider.createBottomOnlyBevelBorder();
	}

	public static Border createBottomlessBevelBorder() {
		return borderProvider.createBottomlessBevelBorder();
	}

	public static Border createRaisedBevelBorder() {
		return borderProvider.createRaisedBevelBorder();
	}

	public static Border createEtchedBorder() {
		return borderProvider.createEtchedBorder();
	}

	public static Border createEtchedBorder(Color color1, Color color2) {
		return borderProvider.createEtchedBorder(color1, color2);
	}

	public static Border createEmptyBorder(Insets borderInsets) {
		return borderProvider.createEmptyBorder(borderInsets);
	}

	public static Border createLoweredBevelBorder() {
		return borderProvider.createLoweredBevelBorder();
	}

	public static Border createBevelBorder(int type, Color highlight, Color color) {
		return borderProvider.createBevelBorder(type, highlight, color);
	}

	public static Border createBevelBorder(int type,
			Color highlightOuter, Color highlightInner,
			Color shadowOuter, Color shadowInner) {
		return borderProvider.createBevelBorder(type, highlightOuter, highlightInner, shadowOuter,
			shadowInner);
	}
}
