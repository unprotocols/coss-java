/**
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.unprotocols.coss;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * <b>Stable</b> APIs' and contracts' intended use: products, goal: deployment
 *
 * Usage of this annotation is entirely option. If none of the COSS annotations
 * specified, this is the one being assumed by default.
 */
@Retention(RetentionPolicy.RUNTIME)
@Draft @RFC(url = "http://rfc.unprotocols.org/spec:2/COSS")
public @interface Stable {
}
