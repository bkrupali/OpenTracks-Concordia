package de.dennisguse.opentracks.settings;

import de.dennisguse.opentracks.R;

public enum UnitSystem {
    METRIC(R.string.stats_units_metric),
    IMPERIAL(R.string.stats_units_imperial),
    NAUTICAL_IMPERIAL(R.string.stats_units_nautical); // Nautical miles with feet

    private final int preferenceIdentifier;

    UnitSystem(int preferenceIdentifier) {
        this.preferenceIdentifier = preferenceIdentifier;
    }

    public int getPreferenceId() {
        return preferenceIdentifier;
    }

    /**
     * @deprecated (It used to initialize before loading from preferences)
     * TODO - should be loaded first
     */
    @Deprecated(since="3.3.1")
    public static UnitSystem defaultUnitSystem() {
        return METRIC;
    }
}
