package fsimpl;

import com.fullstory.DefaultFSStatusListener;
import com.fullstory.FSReason;
import com.fullstory.instrumentation.InstrumentInjectorBridgeImpl;

/* loaded from: classes14.dex */
public class P extends DefaultFSStatusListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InstrumentInjectorBridgeImpl f131411a;

    private P(InstrumentInjectorBridgeImpl instrumentInjectorBridgeImpl) {
        this.f131411a = instrumentInjectorBridgeImpl;
    }

    @Override // com.fullstory.DefaultFSStatusListener, com.fullstory.FSStatusListener
    public void onFSDisabled(FSReason fSReason) {
        InstrumentInjectorBridgeImpl.e(this.f131411a.b(), fSReason);
    }

    @Override // com.fullstory.DefaultFSStatusListener, com.fullstory.FSStatusListener
    public void onFSError(FSReason fSReason) {
        InstrumentInjectorBridgeImpl.d(this.f131411a.b(), fSReason);
    }
}
