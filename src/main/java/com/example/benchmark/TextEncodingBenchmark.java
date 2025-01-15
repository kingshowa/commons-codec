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

package com.example.benchmark;

import org.apache.commons.codec.binary.Base32;
import org.openjdk.jmh.annotations.*;

import org.openjdk.jmh.annotations.Benchmark;
import java.util.concurrent.TimeUnit;


@BenchmarkMode(Mode.Throughput) // Measures how many operations per unit of time
@OutputTimeUnit(TimeUnit.MILLISECONDS) // Results will be shown in milliseconds
@State(Scope.Thread) // Each thread gets its own state
public class TextEncodingBenchmark {

    private Base32 base32;
    private String inputText;
    private byte[] encoded;
    @Setup(Level.Iteration) // Set up the data once per iteration
    public void setup() {
        base32 = new Base32();
        inputText = "This is a performance test for encoding and decoding using Base32.";
        encoded = base32.encode(inputText.getBytes());
    }

    @Benchmark
    public String testBase32Encoding() {
        return base32.encodeAsString(inputText.getBytes());
    }

    @Benchmark
    public String testBase32Decoding() {return new String(base32.decode(encoded));}
}

