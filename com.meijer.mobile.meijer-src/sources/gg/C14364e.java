package gg;

import Vd.AbstractC5516j;
import Vd.InterfaceC5513g;
import com.fullstory.FS;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.internal.f;
import com.google.firebase.remoteconfig.internal.g;
import ig.AbstractC14732e;
import ig.InterfaceC14733f;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* renamed from: gg.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C14364e {

    /* renamed from: a, reason: collision with root package name */
    private f f134193a;

    /* renamed from: b, reason: collision with root package name */
    private C14360a f134194b;

    /* renamed from: c, reason: collision with root package name */
    private Executor f134195c;

    /* renamed from: d, reason: collision with root package name */
    private Set<InterfaceC14733f> f134196d = Collections.newSetFromMap(new ConcurrentHashMap());

    public void d(g gVar) {
        try {
            final AbstractC14732e abstractC14732eB = this.f134194b.b(gVar);
            for (final InterfaceC14733f interfaceC14733f : this.f134196d) {
                this.f134195c.execute(new Runnable() { // from class: gg.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC14733f.a(abstractC14732eB);
                    }
                });
            }
        } catch (FirebaseRemoteConfigException e10) {
            FS.log_w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscribers. Continuing to listen for changes.", e10);
        }
    }

    public void e(final InterfaceC14733f interfaceC14733f) {
        this.f134196d.add(interfaceC14733f);
        final AbstractC5516j<g> abstractC5516jE = this.f134193a.e();
        abstractC5516jE.h(this.f134195c, new InterfaceC5513g() { // from class: gg.b
            @Override // Vd.InterfaceC5513g
            public final void onSuccess(Object obj) throws JSONException {
                C14364e.a(this.f134186a, abstractC5516jE, interfaceC14733f, (g) obj);
            }
        });
    }

    public C14364e(f fVar, C14360a c14360a, Executor executor) {
        this.f134193a = fVar;
        this.f134194b = c14360a;
        this.f134195c = executor;
    }

    public static /* synthetic */ void a(C14364e c14364e, AbstractC5516j abstractC5516j, final InterfaceC14733f interfaceC14733f, g gVar) throws JSONException {
        c14364e.getClass();
        try {
            g gVar2 = (g) abstractC5516j.n();
            if (gVar2 != null) {
                final AbstractC14732e abstractC14732eB = c14364e.f134194b.b(gVar2);
                c14364e.f134195c.execute(new Runnable() { // from class: gg.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC14733f.a(abstractC14732eB);
                    }
                });
            }
        } catch (FirebaseRemoteConfigException e10) {
            FS.log_w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscriber. Continuing to listen for changes.", e10);
        }
    }
}
