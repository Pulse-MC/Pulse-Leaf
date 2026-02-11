package org.dreeam.leaf.version;

import org.galemc.gale.version.AbstractPaperVersionFetcher;

public class LeafVersionFetcher extends AbstractPaperVersionFetcher {

    public static final String DOWNLOAD_PAGE = "https://pulsemc.dev";
    public static final String API_URL = "https://api.pulsemc.dev/releases/";
    public static final String USER_AGENT = null;

    public LeafVersionFetcher() {
        super(
            DOWNLOAD_PAGE,
            "PulseMC",
            "Pulse",
            "Pulse-MC",
            "Pulse-Leaf",
            API_URL,
            USER_AGENT,
            ApiType.BIBLIOTHEK
        );
    }
}
