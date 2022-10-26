package gardensofthedead.fabric;

import net.fabricmc.loader.api.FabricLoader;
import gardensofthedead.ExampleExpectPlatform;

import java.nio.file.Path;

public class ExampleExpectPlatformImpl {
    /**
     * This is our actual method to {@link ExampleExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FabricLoader.getInstance().getConfigDir();
    }
}
