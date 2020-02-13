package bd.dev.android.tarik.gpsalert.google;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by Md.Tarikuzzaman on 13-Feb-2020 4:45 PM, ROSC-II MIS Cell, LGED.
 */
public class GeofenceBroadcastReceiver extends BroadcastReceiver {

    /**
     * Receives incoming intents.
     *
     * @param context the application context.
     * @param intent  sent by Location Services. This Intent is provided to Location
     *                Services (inside a PendingIntent) when addGeofences() is called.
     */
    @Override
    public void onReceive(Context context, Intent intent) {
        // Enqueues a JobIntentService passing the context and intent as parameters
        GeofenceTransitionsJobIntentService.enqueueWork(context, intent);
    }
}
