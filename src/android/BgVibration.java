package cordova.plugin.bgvibration;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class BgVibration extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("bgvibration")) {
            this.bgvibration(args, callbackContext);
            return true;
        }
        return false;
    }

    private void bgvibration(JSONArray args, CallbackContext callback) {
        if (args != null) {
            try {

                callback.success("Java call vibratioin");

            } catch (Exception ex) {
                callback.error("Something went wrong " + ex);
            }

        } else {
            callback.error("Please donot pass null value");
        }

    }
}
