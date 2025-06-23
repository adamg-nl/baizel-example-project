package nl.adamg.example.billing;

import java.util.logging.Logger;
import nl.adamg.example.common.StringUtil;
import javax.annotation.Nonnull;

public class Billing {
    private static final Logger LOG = Logger.getLogger(Billing.class.getName());

    public static void main(@Nonnull String... args) {
        LOG.info(StringUtil.addHello("billing!"));
    }
}
