package fsimpl;

import com.fullstory.DefaultFSStatusListener;
import com.fullstory.FSOnReadyListener;
import com.fullstory.FSSessionData;
import com.fullstory.util.Log;

/* loaded from: classes14.dex */
public class Q extends DefaultFSStatusListener {

    /* renamed from: a, reason: collision with root package name */
    private final FSOnReadyListener f131412a;

    private Q(FSOnReadyListener fSOnReadyListener) {
        this.f131412a = fSOnReadyListener;
    }

    @Override // com.fullstory.DefaultFSStatusListener, com.fullstory.FSStatusListener
    public void onSession(FSSessionData fSSessionData) {
        try {
            this.f131412a.onReady(fSSessionData);
        } catch (Throwable th2) {
            Log.e("Exception executing FSOnReadyListener.onReady callback", th2);
        }
    }
}
