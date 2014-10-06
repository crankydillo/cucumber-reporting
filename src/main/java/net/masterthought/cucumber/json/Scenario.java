package net.masterthought.cucumber.json;

import net.masterthought.cucumber.util.Util;

public class Scenario {
  private Element background;
  private Element scenario;

  Scenario(Element background, Element scenario) {
    this.background = background;
    this.scenario = scenario;
  }

  public Util.Status getStatus() {
    if (background != null && background.getStatus() != Util.Status.PASSED) {
      return background.getStatus();
    }
    return scenario.getStatus();
  }

  public boolean hasBackground() {
    return getBackground() != null;
  }

  public String title() {
    return getScenario().getRawName();
  }

  public Element getBackground() {
    return background;
  }

  public Element getScenario() {
    return scenario;
  }
}
