package com.meijer.mobile.authentication.okta.ux;

import Kk.AppVersion;
import Vs.b;
import android.content.Context;
import androidx.view.c0;
import androidx.view.d0;
import androidx.view.f0;
import bk.AbstractC6392a;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import hi.InterfaceC14523a;
import ji.C15042c;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15809k;
import mv.InterfaceC15783O;
import pv.C16563h;
import pv.InterfaceC16549B;
import pv.P;
import pv.S;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 42\u00020\u0001:\u0003\u001f\u001d\u001bB;\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020*0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001d\u00103\u001a\b\u0012\u0004\u0012\u00020*0.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00065"}, d2 = {"Lcom/meijer/mobile/authentication/okta/ux/A;", "Landroidx/lifecycle/c0;", "LVs/b$b;", "credentialProvider", "LYi/b;", "sessionManager", "LCs/b;", "userProvider", "Lhi/a;", "analyticsEngine", "LKk/a;", "appVersion", "", "autoLogout", "<init>", "(LVs/b$b;LYi/b;LCs/b;Lhi/a;LKk/a;Z)V", "Lbt/b;", "u", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "x", "", "v", "()V", "Landroid/content/Context;", "context", "w", "(Landroid/content/Context;)V", "a", "LVs/b$b;", "b", "LYi/b;", "c", "LCs/b;", "d", "Lhi/a;", "e", "LKk/a;", "f", "Z", "getAutoLogout", "()Z", "Lpv/B;", "Lcom/meijer/mobile/authentication/okta/ux/A$c;", "g", "Lpv/B;", "_loginViewState", "Lpv/P;", "h", "Lpv/P;", "t", "()Lpv/P;", "logoutState", "i", "okta-ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class A extends c0 {

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: j, reason: collision with root package name */
    public static final int f96033j = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b.Companion credentialProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Yi.b sessionManager;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Cs.b userProvider;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14523a analyticsEngine;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final AppVersion appVersion;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean autoLogout;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<c> _loginViewState;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final P<c> logoutState;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/meijer/mobile/authentication/okta/ux/A$a;", "", "<init>", "()V", "Lcom/meijer/mobile/authentication/okta/ux/A$b;", "factory", "", "autoLogout", "Landroidx/lifecycle/f0$c;", "a", "(Lcom/meijer/mobile/authentication/okta/ux/A$b;Z)Landroidx/lifecycle/f0$c;", "okta-ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.authentication.okta.ux.A$a, reason: from kotlin metadata */
    public static final class Companion {

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/meijer/mobile/authentication/okta/ux/A$a$a", "Landroidx/lifecycle/f0$c;", "Landroidx/lifecycle/c0;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/c0;", "okta-ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.authentication.okta.ux.A$a$a, reason: collision with other inner class name */
        public static final class C1357a implements f0.c {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f96042b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f96043c;

            C1357a(b bVar, boolean z10) {
                this.f96042b = bVar;
                this.f96043c = z10;
            }

            @Override // androidx.lifecycle.f0.c
            public <T extends c0> T create(Class<T> modelClass) {
                Intrinsics.j(modelClass, "modelClass");
                A aB = this.f96042b.b(this.f96043c);
                Intrinsics.h(aB, "null cannot be cast to non-null type T of com.meijer.mobile.authentication.okta.ux.OktaLogoutViewModel.Companion.provideFactory.<no name provided>.create");
                return aB;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final f0.c a(b factory, boolean autoLogout) {
            Intrinsics.j(factory, "factory");
            return new C1357a(factory, autoLogout);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bç\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcom/meijer/mobile/authentication/okta/ux/A$b;", "", "", "autoLogout", "Lcom/meijer/mobile/authentication/okta/ux/A;", "b", "(Z)Lcom/meijer/mobile/authentication/okta/ux/A;", "okta-ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface b {
        A b(boolean autoLogout);
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\b\u000f\u000b\u0010B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0003\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0004\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/authentication/okta/ux/A$c;", "", "", "isLoggedIn", "Lbk/a;", "message", "<init>", "(ZLbk/a;)V", "a", "Z", "()Z", "b", "Lbk/a;", "getMessage", "()Lbk/a;", "c", "d", "Lcom/meijer/mobile/authentication/okta/ux/A$c$a;", "Lcom/meijer/mobile/authentication/okta/ux/A$c$b;", "Lcom/meijer/mobile/authentication/okta/ux/A$c$c;", "Lcom/meijer/mobile/authentication/okta/ux/A$c$d;", "okta-ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class c {

        /* renamed from: c, reason: collision with root package name */
        public static final int f96044c = AbstractC6392a.f60445b;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final boolean isLoggedIn;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final AbstractC6392a message;

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0005\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/authentication/okta/ux/A$c$a;", "Lcom/meijer/mobile/authentication/okta/ux/A$c;", "Lbk/a;", "message", "", "isLoggedIn", "<init>", "(Lbk/a;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "d", "Lbk/a;", "getMessage", "()Lbk/a;", "e", "Z", "()Z", "okta-ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.authentication.okta.ux.A$c$a, reason: from toString */
        public static final /* data */ class Confirm extends c {

            /* renamed from: f, reason: collision with root package name */
            public static final int f96047f = AbstractC6392a.f60445b;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC6392a message;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isLoggedIn;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Confirm)) {
                    return false;
                }
                Confirm confirm = (Confirm) other;
                return Intrinsics.e(this.message, confirm.message) && this.isLoggedIn == confirm.isLoggedIn;
            }

            public int hashCode() {
                return (this.message.hashCode() * 31) + Boolean.hashCode(this.isLoggedIn);
            }

            public String toString() {
                return "Confirm(message=" + this.message + ", isLoggedIn=" + this.isLoggedIn + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Confirm(AbstractC6392a message, boolean z10) {
                super(z10, message, null);
                Intrinsics.j(message, "message");
                this.message = message;
                this.isLoggedIn = z10;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0003\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/authentication/okta/ux/A$c$b;", "Lcom/meijer/mobile/authentication/okta/ux/A$c;", "", "isLoggedIn", "Lbk/a;", "message", "<init>", "(ZLbk/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "d", "Z", "()Z", "e", "Lbk/a;", "getMessage", "()Lbk/a;", "okta-ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.authentication.okta.ux.A$c$b, reason: from toString */
        public static final /* data */ class Error extends c {

            /* renamed from: f, reason: collision with root package name */
            public static final int f96050f = AbstractC6392a.f60445b;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isLoggedIn;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC6392a message;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Error)) {
                    return false;
                }
                Error error = (Error) other;
                return this.isLoggedIn == error.isLoggedIn && Intrinsics.e(this.message, error.message);
            }

            public int hashCode() {
                return (Boolean.hashCode(this.isLoggedIn) * 31) + this.message.hashCode();
            }

            public String toString() {
                return "Error(isLoggedIn=" + this.isLoggedIn + ", message=" + this.message + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(boolean z10, AbstractC6392a message) {
                super(z10, message, null);
                Intrinsics.j(message, "message");
                this.isLoggedIn = z10;
                this.message = message;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0003\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/authentication/okta/ux/A$c$c;", "Lcom/meijer/mobile/authentication/okta/ux/A$c;", "", "isLoggedIn", "Lbk/a;", "message", "<init>", "(ZLbk/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "d", "Z", "()Z", "e", "Lbk/a;", "a", "()Lbk/a;", "okta-ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.authentication.okta.ux.A$c$c, reason: collision with other inner class name and from toString */
        public static final /* data */ class Loading extends c {

            /* renamed from: f, reason: collision with root package name */
            public static final int f96053f = AbstractC6392a.f60445b;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isLoggedIn;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC6392a message;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Loading)) {
                    return false;
                }
                Loading loading = (Loading) other;
                return this.isLoggedIn == loading.isLoggedIn && Intrinsics.e(this.message, loading.message);
            }

            public int hashCode() {
                return (Boolean.hashCode(this.isLoggedIn) * 31) + this.message.hashCode();
            }

            public String toString() {
                return "Loading(isLoggedIn=" + this.isLoggedIn + ", message=" + this.message + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Loading(boolean z10, AbstractC6392a message) {
                super(z10, message, null);
                Intrinsics.j(message, "message");
                this.isLoggedIn = z10;
                this.message = message;
            }

            /* renamed from: a, reason: from getter */
            public AbstractC6392a getMessage() {
                return this.message;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/authentication/okta/ux/A$c$d;", "Lcom/meijer/mobile/authentication/okta/ux/A$c;", "Lbk/a;", "message", "<init>", "(Lbk/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Lbk/a;", "a", "()Lbk/a;", "okta-ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.authentication.okta.ux.A$c$d, reason: from toString */
        public static final /* data */ class Success extends c {

            /* renamed from: e, reason: collision with root package name */
            public static final int f96056e = AbstractC6392a.f60445b;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC6392a message;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.e(this.message, ((Success) other).message);
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            public String toString() {
                return "Success(message=" + this.message + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(AbstractC6392a message) {
                super(false, message, null);
                Intrinsics.j(message, "message");
                this.message = message;
            }

            /* renamed from: a, reason: from getter */
            public AbstractC6392a getMessage() {
                return this.message;
            }
        }

        public /* synthetic */ c(boolean z10, AbstractC6392a abstractC6392a, DefaultConstructorMarker defaultConstructorMarker) {
            this(z10, abstractC6392a);
        }

        private c(boolean z10, AbstractC6392a abstractC6392a) {
            this.isLoggedIn = z10;
            this.message = abstractC6392a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.authentication.okta.ux.OktaLogoutViewModel", f = "OktaLogoutViewModel.kt", l = {60}, m = "idToken")
    static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f96058a;

        /* renamed from: c, reason: collision with root package name */
        int f96060c;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f96058a = obj;
            this.f96060c |= Integer.MIN_VALUE;
            return A.this.u(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.authentication.okta.ux.OktaLogoutViewModel$logoutLocal$1", f = "OktaLogoutViewModel.kt", l = {BinsView.TOTE_HEIGHT_DP}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f96061a;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return A.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f96061a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                Yi.b bVar = A.this.sessionManager;
                this.f96061a = 1;
                if (bVar.logout(this) == objF) {
                    return objF;
                }
            }
            InterfaceC16549B interfaceC16549B = A.this._loginViewState;
            do {
                value = interfaceC16549B.getValue();
            } while (!interfaceC16549B.e(value, new c.Success(AbstractC6392a.INSTANCE.d(B.f96084g, new Object[0]))));
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.authentication.okta.ux.OktaLogoutViewModel$logoutOfBrowser$1", f = "OktaLogoutViewModel.kt", l = {73, 77, 82, 95}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f96063a;

        /* renamed from: b, reason: collision with root package name */
        Object f96064b;

        /* renamed from: c, reason: collision with root package name */
        Object f96065c;

        /* renamed from: d, reason: collision with root package name */
        Object f96066d;

        /* renamed from: e, reason: collision with root package name */
        Object f96067e;

        /* renamed from: f, reason: collision with root package name */
        Object f96068f;

        /* renamed from: g, reason: collision with root package name */
        int f96069g;

        /* renamed from: h, reason: collision with root package name */
        int f96070h;

        /* renamed from: i, reason: collision with root package name */
        int f96071i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f96072j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Context f96074l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Context context, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f96074l = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            f fVar = A.this.new f(this.f96074l, continuation);
            fVar.f96072j = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x015e, code lost:
        
            if (r3 == r1) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x01a7, code lost:
        
            if (r6.e(r4, new com.meijer.mobile.authentication.okta.ux.A.c.Error(r3, r11)) != false) goto L47;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00aa A[PHI: r2 r9 r10 r11 r12 r13
          0x00aa: PHI (r2v5 int) = (r2v4 int), (r2v16 int) binds: [B:16:0x00a6, B:13:0x005f] A[DONT_GENERATE, DONT_INLINE]
          0x00aa: PHI (r9v3 java.lang.Object) = (r9v2 java.lang.Object), (r9v10 java.lang.Object) binds: [B:16:0x00a6, B:13:0x005f] A[DONT_GENERATE, DONT_INLINE]
          0x00aa: PHI (r10v2 com.meijer.mobile.authentication.okta.ux.A) = (r10v1 com.meijer.mobile.authentication.okta.ux.A), (r10v8 com.meijer.mobile.authentication.okta.ux.A) binds: [B:16:0x00a6, B:13:0x005f] A[DONT_GENERATE, DONT_INLINE]
          0x00aa: PHI (r11v2 pv.B) = (r11v1 pv.B), (r11v11 pv.B) binds: [B:16:0x00a6, B:13:0x005f] A[DONT_GENERATE, DONT_INLINE]
          0x00aa: PHI (r12v2 mv.O) = (r12v1 mv.O), (r12v9 mv.O) binds: [B:16:0x00a6, B:13:0x005f] A[DONT_GENERATE, DONT_INLINE]
          0x00aa: PHI (r13v3 java.lang.Object) = (r13v2 java.lang.Object), (r13v7 java.lang.Object) binds: [B:16:0x00a6, B:13:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00c5  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00df  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00e7  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0108  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x01aa  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x01cb  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00a6 -> B:18:0x00aa). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x015e -> B:37:0x0161). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 462
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.authentication.okta.ux.A.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.authentication.okta.ux.OktaLogoutViewModel", f = "OktaLogoutViewModel.kt", l = {64}, m = "requiresLogout")
    static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f96075a;

        /* renamed from: c, reason: collision with root package name */
        int f96077c;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f96075a = obj;
            this.f96077c |= Integer.MIN_VALUE;
            return A.this.x(this);
        }
    }

    public A(b.Companion credentialProvider, Yi.b sessionManager, Cs.b userProvider, InterfaceC14523a analyticsEngine, AppVersion appVersion, boolean z10) {
        Object confirm;
        Intrinsics.j(credentialProvider, "credentialProvider");
        Intrinsics.j(sessionManager, "sessionManager");
        Intrinsics.j(userProvider, "userProvider");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        Intrinsics.j(appVersion, "appVersion");
        this.credentialProvider = credentialProvider;
        this.sessionManager = sessionManager;
        this.userProvider = userProvider;
        this.analyticsEngine = analyticsEngine;
        this.appVersion = appVersion;
        this.autoLogout = z10;
        if (z10) {
            confirm = new c.Loading(userProvider.b(), AbstractC6392a.INSTANCE.d(C15042c.f140910g, new Object[0]));
        } else {
            confirm = new c.Confirm(AbstractC6392a.INSTANCE.d(B.f96082e, new Object[0]), userProvider.b());
        }
        InterfaceC16549B<c> interfaceC16549BA = S.a(confirm);
        this._loginViewState = interfaceC16549BA;
        this.logoutState = C16563h.c(interfaceC16549BA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(kotlin.coroutines.Continuation<? super bt.b> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.meijer.mobile.authentication.okta.ux.A.d
            if (r0 == 0) goto L13
            r0 = r5
            com.meijer.mobile.authentication.okta.ux.A$d r0 = (com.meijer.mobile.authentication.okta.ux.A.d) r0
            int r1 = r0.f96060c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f96060c = r1
            goto L18
        L13:
            com.meijer.mobile.authentication.okta.ux.A$d r0 = new com.meijer.mobile.authentication.okta.ux.A$d
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f96058a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f96060c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.ResultKt.b(r5)
            Vs.b$b r5 = r4.credentialProvider
            r0.f96060c = r3
            java.lang.Object r5 = r5.d(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            Vs.b r5 = (Vs.b) r5
            if (r5 == 0) goto L48
            bt.b r5 = r5.i()
            return r5
        L48:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.authentication.okta.ux.A.u(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(kotlin.coroutines.Continuation<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.meijer.mobile.authentication.okta.ux.A.g
            if (r0 == 0) goto L13
            r0 = r5
            com.meijer.mobile.authentication.okta.ux.A$g r0 = (com.meijer.mobile.authentication.okta.ux.A.g) r0
            int r1 = r0.f96077c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f96077c = r1
            goto L18
        L13:
            com.meijer.mobile.authentication.okta.ux.A$g r0 = new com.meijer.mobile.authentication.okta.ux.A$g
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f96075a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f96077c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.b(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.ResultKt.b(r5)
            r0.f96077c = r3
            java.lang.Object r5 = r4.u(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            if (r5 != 0) goto L49
            Cs.b r5 = r4.userProvider
            boolean r5 = r5.b()
            if (r5 == 0) goto L48
            goto L49
        L48:
            r3 = 0
        L49:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.a(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.authentication.okta.ux.A.x(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final P<c> t() {
        return this.logoutState;
    }

    public final void w(Context context) {
        Intrinsics.j(context, "context");
        this.analyticsEngine.k(this.autoLogout ? Zi.n.f43843a.e() : Zi.n.f43843a.i());
        C15809k.d(d0.a(this), null, null, new f(context, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v() {
        C15809k.d(d0.a(this), null, null, new e(null), 3, null);
    }
}
