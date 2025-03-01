/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.longKey;
import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class ServerIncubatingAttributes {
  /**
   * Server domain name if available without reverse DNS lookup; otherwise, IP address or Unix
   * domain socket name.
   *
   * <p>Notes:
   *
   * <p>When observed from the client side, and when communicating through an intermediary, {@code
   * server.address} SHOULD represent the server address behind any intermediaries, for example
   * proxies, if it's available.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.ServerAttributes#SERVER_ADDRESS} attribute.
   */
  @Deprecated public static final AttributeKey<String> SERVER_ADDRESS = stringKey("server.address");

  /**
   * Server port number.
   *
   * <p>Notes:
   *
   * <p>When observed from the client side, and when communicating through an intermediary, {@code
   * server.port} SHOULD represent the server port behind any intermediaries, for example proxies,
   * if it's available.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.ServerAttributes#SERVER_PORT} attribute.
   */
  @Deprecated public static final AttributeKey<Long> SERVER_PORT = longKey("server.port");

  // Enum definitions

  private ServerIncubatingAttributes() {}
}
