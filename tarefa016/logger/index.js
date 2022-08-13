<script src="https://unpkg.com/js-logger/src/logger.min.js"></script>

Logger.useDefaults();

Logger.debug("I'm a debug message!");
Logger.info("OMG! Check this window out!", window);
Logger.warn("Purple Alert! Purple Alert!");
Logger.error("HOLY SHI... no carrier.");
Logger.trace("Very verbose message that usually is not needed...");
Logger.trace("...containing stack trace (if console.trace() method supports it)");