package org.nmslite.utils;

public class Constants
{
    private Constants() {
        throw new IllegalStateException("Constant class");
    }

    public static final String  DEFAULT_POLL_TIME = "default.poll.time";

    public static final String MAX_BATCH_SIZE = "max.batch.size";

    public static final String PLUGIN_PROCESS_TIMEOUT =   "plugin.process.timeout";

    public static final Integer OK = 200;

    public static final Integer BAD_REQUEST = 400;

    public static final Integer SUCCESS_CODE = 000;

    public static final String INVALID_CREDENTIALS = "-1";

    public static final String MESSAGE_SEPARATOR = "@";

    public static final String ID = "id";

    public static final String HTTP_PORT = "http.port";

    public static final String HOST = "http.hostname";

    public static final String CREDENTIAL_ROUTE = "/credential";

    public static final String CREDENTIAL_DELETE_ROUTE = "/credential/:id";

    public static final String DISCOVERY_ROUTE = "/discovery";

    public static final String DISCOVERY_DELETE_ROUTE = "/discovery/:id";

    public static final String DISCOVERY_RUN_ROUTE = "/discovery/run/:id";

    public static final String PROVISION_ROUTE = "/provision/:id";

    public static final String GET_PROVISION_ROUTE = "/provision/";

    public static final String CONFIG_PATH = System.getProperty("user.dir") + "/config/config.json";

    public static final String CREDENTIAL = "credential";

    public static final String CREDENTIAL_ID = "credential.id";

    public static final String CREDENTIAL_IDS = "credential.ids";

    public static final String USERNAME = "username";

    public static final String PASSWORD = "password";

    public static final String NAME = "name";

    public static final String DISCOVERY = "discovery";

    public static final String DISCOVERY_ID = "discovery.id";

    public static final String DISCOVERY_IDS = "discovery.ids";

    public static final String DISCOVERY_DATA = "discovery.data";

    public static final String IP = "ip";

    public static final String DEVICE_PORT = "device.port";

    public static final String DISCOVERY_RUN = "discovery.run";

    public static final String POLLING = "polling";

    public static final String VALID_DISCOVERY = "valid_discovery";

    public static final String CREDENTIAL_PROFILES = "credential.profiles";

    public static final String Context = "context";

    public static final String PROVISION = "provision";

    public static final String PROVISION_DEVICES = "provision.devices";

    public static final String RESULT = "result";

    public static final String STATUS = "status";

    public static final String SUCCESS = "success";

    public static final String FAILED = "failed";

    public static final String MESSAGE = "message";

    public static final String ERRORS = "errors";

    public static final String ERROR = "error";

    public static final String ERROR_CODE = "error.code";

    public static final String ERROR_MESSAGE = "error.message";

    public static final String REQUEST_TYPE = "request.type";

    public static final String EVENT_RUN_DISCOVERY = "event.run.discovery";

    public static final String PLUGIN_APPLICATION_PATH = "/PluginEngine/bootstrap";

    public static final String INVALID_REQUEST_TYPE = "Invalid Request Type";

    public static final String UNIQUE_SEPARATOR  = "~@@~";
}