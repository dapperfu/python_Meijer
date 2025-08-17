package eg;

import Td.AbstractC5232j;
import Td.InterfaceC5229g;
import com.fullstory.FS;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.internal.f;
import com.google.firebase.remoteconfig.internal.g;
import gg.AbstractC14258e;
import gg.InterfaceC14259f;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* renamed from: eg.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C13660e {

    /* renamed from: a, reason: collision with root package name */
    private f f128725a;

    /* renamed from: b, reason: collision with root package name */
    private C13656a f128726b;

    /* renamed from: c, reason: collision with root package name */
    private Executor f128727c;

    /* renamed from: d, reason: collision with root package name */
    private Set<InterfaceC14259f> f128728d = Collections.newSetFromMap(new ConcurrentHashMap());

    public void d(g gVar) {
        try {
            final AbstractC14258e abstractC14258eB = this.f128726b.b(gVar);
            for (final InterfaceC14259f interfaceC14259f : this.f128728d) {
                this.f128727c.execute(new Runnable() { // from class: eg.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC14259f.a(abstractC14258eB);
                    }
                });
            }
        } catch (FirebaseRemoteConfigException e10) {
            FS.log_w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscribers. Continuing to listen for changes.", e10);
        }
    }

    public void e(final InterfaceC14259f interfaceC14259f) {
        this.f128728d.add(interfaceC14259f);
        final AbstractC5232j<g> abstractC5232jE = this.f128725a.e();
        abstractC5232jE.h(this.f128727c, new InterfaceC5229g() { // from class: eg.b
            @Override // Td.InterfaceC5229g
            public final void onSuccess(Object obj) throws JSONException {
                C13660e.a(this.f128718a, abstractC5232jE, interfaceC14259f, (g) obj);
            }
        });
    }

    public C13660e(f fVar, C13656a c13656a, Executor executor) {
        this.f128725a = fVar;
        this.f128726b = c13656a;
        this.f128727c = executor;
    }

    public static /* synthetic */ void a(C13660e c13660e, AbstractC5232j abstractC5232j, final InterfaceC14259f interfaceC14259f, g gVar) throws JSONException {
        c13660e.getClass();
        try {
            g gVar2 = (g) abstractC5232j.n();
            if (gVar2 != null) {
                final AbstractC14258e abstractC14258eB = c13660e.f128726b.b(gVar2);
                c13660e.f128727c.execute(new Runnable() { // from class: eg.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC14259f.a(abstractC14258eB);
                    }
                });
            }
        } catch (FirebaseRemoteConfigException e10) {
            FS.log_w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscriber. Continuing to listen for changes.", e10);
        }
    }
}
