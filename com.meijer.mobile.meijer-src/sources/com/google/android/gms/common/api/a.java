package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.AbstractC6646c;
import com.google.android.gms.common.internal.C6648e;
import com.google.android.gms.common.internal.InterfaceC6654k;
import com.google.android.gms.common.internal.r;
import id.C14720c;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import jd.InterfaceC14981d;
import jd.InterfaceC14990m;

/* loaded from: classes4.dex */
public final class a<O extends d> {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC1266a f65587a;

    /* renamed from: b, reason: collision with root package name */
    private final g f65588b;

    /* renamed from: c, reason: collision with root package name */
    private final String f65589c;

    /* renamed from: com.google.android.gms.common.api.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1266a<T extends f, O> extends e<T, O> {
        @Deprecated
        public T buildClient(Context context, Looper looper, C6648e c6648e, O o10, e.a aVar, e.b bVar) {
            return (T) buildClient(context, looper, c6648e, (C6648e) o10, (InterfaceC14981d) aVar, (InterfaceC14990m) bVar);
        }

        public T buildClient(Context context, Looper looper, C6648e c6648e, O o10, InterfaceC14981d interfaceC14981d, InterfaceC14990m interfaceC14990m) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    public interface b {
    }

    public static class c<C extends b> {
    }

    public interface d {

        /* renamed from: a, reason: collision with root package name */
        public static final c f65590a = new c(null);

        /* renamed from: com.google.android.gms.common.api.a$d$a, reason: collision with other inner class name */
        public interface InterfaceC1267a extends d {
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
        void connect(AbstractC6646c.InterfaceC1269c interfaceC1269c);

        void disconnect();

        void disconnect(String str);

        C14720c[] getAvailableFeatures();

        String getEndpointPackageName();

        String getLastDisconnectMessage();

        int getMinApkVersion();

        void getRemoteService(InterfaceC6654k interfaceC6654k, Set<Scope> set);

        Set<Scope> getScopesForConnectionlessNonSignIn();

        boolean isConnected();

        boolean isConnecting();

        void onUserSignOut(AbstractC6646c.e eVar);

        boolean requiresGooglePlayServices();

        boolean requiresSignIn();
    }

    public static final class g<C extends f> extends c<C> {
    }

    public final AbstractC1266a a() {
        return this.f65587a;
    }

    public final c b() {
        return this.f65588b;
    }

    public final String c() {
        return this.f65589c;
    }

    public <C extends f> a(String str, AbstractC1266a<C, O> abstractC1266a, g<C> gVar) {
        r.m(abstractC1266a, "Cannot construct an Api with a null ClientBuilder");
        r.m(gVar, "Cannot construct an Api with a null ClientKey");
        this.f65589c = str;
        this.f65587a = abstractC1266a;
        this.f65588b = gVar;
    }
}
