package nh;

import com.launchdarkly.sdk.LDContext;
import com.launchdarkly.sdk.android.ConnectionInformation;
import com.launchdarkly.sdk.android.DataModel$Flag;
import java.util.Map;

/* renamed from: nh.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC15948f {
    void a(LDContext lDContext, DataModel$Flag dataModel$Flag);

    void b();

    void c(ConnectionInformation.ConnectionMode connectionMode, Throwable th2);

    void d(LDContext lDContext, Map<String, DataModel$Flag> map);
}
