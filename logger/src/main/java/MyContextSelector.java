import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.selector.ContextSelector;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;

import java.util.List;

public class MyContextSelector implements ContextSelector {
    @Override
    public LoggerContext getLoggerContext() {
        return null;
    }

    @Override
    public LoggerContext getLoggerContext(String s) {
        return null;
    }

    @Override
    public LoggerContext getDefaultLoggerContext() {
        return null;
    }

    @Override
    public LoggerContext detachLoggerContext(String s) {
        return null;
    }

    @Override
    public List<String> getContextNames() {
        return null;
    }
}
