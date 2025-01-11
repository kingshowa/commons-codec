/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.codec.cli;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/**
 * Tests {@link Digest}.
 */
public class DigestTest {

    @Test
    public void testMainNoArgs() {
        assertThrows(IllegalArgumentException.class, () -> Digest.main(new String[] {}));
    }

    @Test
    public void testMainOneArg() {
        assertThrows(IllegalArgumentException.class, () -> Digest.main(new String[] { "SHA-256" }));
    }

    @Test
    public void testMainTwoArgs() {
        assertThrows(IllegalArgumentException.class, () -> Digest.main(new String[] { "SHA-256", "file" }));
    }

    @Test
    public void testMainInvalidAlgorithm() {
        assertThrows(IllegalArgumentException.class, () -> Digest.main(new String[] { "SHA-256", "file", "invalid" }));
    }

    @Test
    public void testMainInvalidFile() {
        assertThrows(IllegalArgumentException.class, () -> Digest.main(new String[] { "SHA-256", "invalid", "SHA-256" }));
    }

    @Test
    public void testMainInvalidAlgorithmAndFile() {
        assertThrows(IllegalArgumentException.class, () -> Digest.main(new String[] { "SHA-256", "invalid", "invalid" }));
    }
}
