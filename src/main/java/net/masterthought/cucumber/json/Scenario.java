package net.masterthought.cucumber.json;

public class Scenario {
  private Element background;
  private Element scenario;

  Scenario(Element background, Element scenario) {
    this.background = background;
    this.scenario = scenario;
  }

  public boolean hasBackground() {
    return getBackground() != null;
  }

  public String title() {
    return getScenario().getName();
  }

  public Element getBackground() {
    return background;
  }

  public Element getScenario() {
    return scenario;
  }
}
