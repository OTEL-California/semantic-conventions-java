/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class UserAgentIncubatingAttributes {
  /**
   * Name of the user-agent extracted from original. Usually refers to the browser's name.
   *
   * <p>Notes:
   *
   * <p><a href="https://www.whatsmyua.info">Example</a> of extracting browser's name from original
   * string. In the case of using a user-agent for non-browser products, such as microservices with
   * multiple names/versions inside the {@code user_agent.original}, the most significant name
   * SHOULD be selected. In such a scenario it should align with {@code user_agent.version}
   */
  public static final AttributeKey<String> USER_AGENT_NAME = stringKey("user_agent.name");

  /**
   * Value of the <a href="https://www.rfc-editor.org/rfc/rfc9110.html#field.user-agent">HTTP
   * User-Agent</a> header sent by the client.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.UserAgentAttributes#USER_AGENT_ORIGINAL} attribute.
   */
  @Deprecated
  public static final AttributeKey<String> USER_AGENT_ORIGINAL = stringKey("user_agent.original");

  /**
   * Human readable operating system name.
   *
   * <p>Notes:
   *
   * <p>For mapping user agent strings to OS names, libraries such as <a
   * href="https://github.com/ua-parser">ua-parser</a> can be utilized.
   */
  public static final AttributeKey<String> USER_AGENT_OS_NAME = stringKey("user_agent.os.name");

  /**
   * The version string of the operating system as defined in <a
   * href="/docs/resource/README.md#version-attributes">Version Attributes</a>.
   *
   * <p>Notes:
   *
   * <p>For mapping user agent strings to OS versions, libraries such as <a
   * href="https://github.com/ua-parser">ua-parser</a> can be utilized.
   */
  public static final AttributeKey<String> USER_AGENT_OS_VERSION =
      stringKey("user_agent.os.version");

  /**
   * Specifies the category of synthetic traffic, such as tests or bots.
   *
   * <p>Notes:
   *
   * <p>This attribute MAY be derived from the contents of the {@code user_agent.original}
   * attribute. Components that populate the attribute are responsible for determining what they
   * consider to be synthetic bot or test traffic. This attribute can either be set for
   * self-identification purposes, or on telemetry detected to be generated as a result of a
   * synthetic request. This attribute is useful for distinguishing between genuine client traffic
   * and synthetic traffic generated by bots or tests.
   */
  public static final AttributeKey<String> USER_AGENT_SYNTHETIC_TYPE =
      stringKey("user_agent.synthetic.type");

  /**
   * Version of the user-agent extracted from original. Usually refers to the browser's version
   *
   * <p>Notes:
   *
   * <p><a href="https://www.whatsmyua.info">Example</a> of extracting browser's version from
   * original string. In the case of using a user-agent for non-browser products, such as
   * microservices with multiple names/versions inside the {@code user_agent.original}, the most
   * significant version SHOULD be selected. In such a scenario it should align with {@code
   * user_agent.name}
   */
  public static final AttributeKey<String> USER_AGENT_VERSION = stringKey("user_agent.version");

  // Enum definitions

  /** Values for {@link #USER_AGENT_SYNTHETIC_TYPE}. */
  public static final class UserAgentSyntheticTypeIncubatingValues {
    /** Bot source. */
    public static final String BOT = "bot";

    /** Synthetic test source. */
    public static final String TEST = "test";

    private UserAgentSyntheticTypeIncubatingValues() {}
  }

  private UserAgentIncubatingAttributes() {}
}
