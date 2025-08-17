package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.AbstractC6521c;
import com.google.android.gms.common.internal.C6523e;
import com.google.android.gms.common.internal.InterfaceC6529k;
import com.google.android.gms.common.internal.r;
import gd.C14244c;
import hd.InterfaceC14403d;
import hd.InterfaceC14412m;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public final class a<O extends d> {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC1257a f64747a;

    /* renamed from: b, reason: collision with root package name */
    private final g f64748b;

    /* renamed from: c, reason: collision with root package name */
    private final String f64749c;

    /* renamed from: com.google.android.gms.common.api.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1257a<T extends f, O> extends e<T, O> {
        @Deprecated
        public T buildClient(Context context, Looper looper, C6523e c6523e, O o10, e.a aVar, e.b bVar) {
            return (T) buildClient(context, looper, c6523e, (C6523e) o10, (InterfaceC14403d) aVar, (InterfaceC14412m) bVar);
        }

        public T buildClient(Context context, Looper looper, C6523e c6523e, O o10, InterfaceC14403d interfaceC14403d, InterfaceC14412m interfaceC14412m) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    public interface b {
    }

    public static class c<C extends b> {
    }

    public interface d {

        /* renamed from: a, reason: collision with root package name */
        public static final c f64750a = new c(null);

        /* renamed from: com.google.android.gms.common.api.a$d$a, reason: collision with other inner class name */
        public interface InterfaceC1258a extends d {
            Account b();
        }

        public interface b extends d {
            GoogleSignInAccount a();
        }

        public static final class c implements d {
            private c() {
            }

            /* synthetic */ c(m mVar) {
            }
        }
    }

    public static abstract class e<T extends b, O> {
        public static final int API_PRIORITY_GAMES = 1;
        public static final int API_PRIORITY_OTHER = Integer.MAX_VALUE;
        public static final int API_PRIORITY_PLUS = 2;

        public int getPriority() {
            return API_PRIORITY_OTHER;
        }

        public List<Scope> getImpliedScopes(O o10) {
            return Collections.EMPTY_LIST;
        }
    }

    public interface f extends b {
        void connect(AbstractC6521c.InterfaceC1260c interfaceC1260c);

        void disconnect();

        void disconnect(String str);

        C14244c[] getAvailableFeatures();

        String getEndpointPackageName();

        String getLastDisconnectMessage();

        int getMinApkVersion();

        void getRemoteService(InterfaceC6529k interfaceC6529k, Set<Scope> set);

        Set<Scope> getScopesForConnectionlessNonSignIn();

        boolean isConnected();

        boolean isConnecting();

        void onUserSignOut(AbstractC6521c.e eVar);

        boolean requiresGooglePlayServices();

        boolean requiresSignIn();
    }

    public static final class g<C extends f> extends c<C> {
    }

    public final AbstractC1257a a() {
        return this.f64747a;
    }

    public final c b() {
        return this.f64748b;
    }

    public final String c() {
        return this.f64749c;
    }

    public <C extends f> a(String str, AbstractC1257a<C, O> abstractC1257a, g<C> gVar) {
        r.m(abstractC1257a, "Cannot construct an Api with a null ClientBuilder");
        r.m(gVar, "Cannot construct an Api with a null ClientKey");
        this.f64749c = str;
        this.f64747a = abstractC1257a;
        this.f64748b = gVar;
    }
}
