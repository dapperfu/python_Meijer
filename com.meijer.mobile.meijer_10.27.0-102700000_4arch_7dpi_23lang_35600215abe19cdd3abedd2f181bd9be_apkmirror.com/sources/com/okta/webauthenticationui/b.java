package com.okta.webauthenticationui;

import android.app.Activity;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.view.AbstractC5985A;
import androidx.view.C5996L;
import androidx.view.c0;
import androidx.view.d0;
import com.okta.webauthenticationui.c;
import et.C13777j;
import et.InterfaceC13776i;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import qv.C16648k;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0002\u0019\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/okta/webauthenticationui/b;", "Landroidx/lifecycle/c0;", "Landroidx/lifecycle/L;", "savedStateHandle", "<init>", "(Landroidx/lifecycle/L;)V", "Landroid/app/Activity;", "activity", "", "urlString", "", "q", "(Landroid/app/Activity;Ljava/lang/String;)V", "s", "(Landroid/app/Activity;)V", "Landroid/net/Uri;", "data", "r", "(Landroid/net/Uri;)V", "o", "()V", "a", "Landroidx/lifecycle/L;", "Landroidx/lifecycle/A;", "Lcom/okta/webauthenticationui/b$c;", "b", "Landroidx/lifecycle/A;", "p", "()Landroidx/lifecycle/A;", "stateLiveData", "c", "web-authentication-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b extends c0 {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    private static InterfaceC13776i f119886d = C13777j.f130056b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C5996L savedStateHandle;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5985A<c> stateLiveData;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.okta.webauthenticationui.ForegroundViewModel$1", f = "ForegroundViewModel.kt", l = {56}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f119889a;

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return b.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f119889a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                if (Intrinsics.e(b.this.p().e(), c.C1972b.f119892a)) {
                    InterfaceC13776i interfaceC13776iA = b.INSTANCE.a();
                    this.f119889a = 1;
                    obj = interfaceC13776iA.e(this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
            com.okta.webauthenticationui.c cVar = (com.okta.webauthenticationui.c) obj;
            if (cVar instanceof c.a) {
                b.this.savedStateHandle.f("FOREGROUND_STATE_LIVE_DATA_KEY", c.C1973c.f119893a);
            } else if (cVar instanceof c.b) {
                b.this.savedStateHandle.f("FOREGROUND_STATE_LIVE_DATA_KEY", new c.d(((c.b) cVar).getUrl().getUrl()));
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R(\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u000b\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/okta/webauthenticationui/b$b;", "", "<init>", "()V", "Let/i;", "redirectCoordinator", "Let/i;", "a", "()Let/i;", "setRedirectCoordinator", "(Let/i;)V", "getRedirectCoordinator$annotations", "", "LIVE_DATA_KEY", "Ljava/lang/String;", "web-authentication-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.okta.webauthenticationui.b$b, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final InterfaceC13776i a() {
            return b.f119886d;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/okta/webauthenticationui/b$c;", "Landroid/os/Parcelable;", "<init>", "()V", "b", "c", "d", "a", "Lcom/okta/webauthenticationui/b$c$a;", "Lcom/okta/webauthenticationui/b$c$b;", "Lcom/okta/webauthenticationui/b$c$c;", "Lcom/okta/webauthenticationui/b$c$d;", "web-authentication-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class c implements Parcelable {

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/okta/webauthenticationui/b$c$a;", "Lcom/okta/webauthenticationui/b$c;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "web-authentication-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final a f119891a = new a();
            public static final Parcelable.Creator<a> CREATOR = new C1971a();

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: com.okta.webauthenticationui.b$c$a$a, reason: collision with other inner class name */
            public static final class C1971a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a createFromParcel(Parcel parcel) {
                    Intrinsics.j(parcel, "parcel");
                    parcel.readInt();
                    return a.f119891a;
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final a[] newArray(int i10) {
                    return new a[i10];
                }
            }

            private a() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.j(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/okta/webauthenticationui/b$c$b;", "Lcom/okta/webauthenticationui/b$c;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "web-authentication-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: com.okta.webauthenticationui.b$c$b, reason: collision with other inner class name */
        public static final class C1972b extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final C1972b f119892a = new C1972b();
            public static final Parcelable.Creator<C1972b> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: com.okta.webauthenticationui.b$c$b$a */
            public static final class a implements Parcelable.Creator<C1972b> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C1972b createFromParcel(Parcel parcel) {
                    Intrinsics.j(parcel, "parcel");
                    parcel.readInt();
                    return C1972b.f119892a;
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final C1972b[] newArray(int i10) {
                    return new C1972b[i10];
                }
            }

            private C1972b() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.j(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/okta/webauthenticationui/b$c$c;", "Lcom/okta/webauthenticationui/b$c;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "web-authentication-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: com.okta.webauthenticationui.b$c$c, reason: collision with other inner class name */
        public static final class C1973c extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final C1973c f119893a = new C1973c();
            public static final Parcelable.Creator<C1973c> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: com.okta.webauthenticationui.b$c$c$a */
            public static final class a implements Parcelable.Creator<C1973c> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C1973c createFromParcel(Parcel parcel) {
                    Intrinsics.j(parcel, "parcel");
                    parcel.readInt();
                    return C1973c.f119893a;
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final C1973c[] newArray(int i10) {
                    return new C1973c[i10];
                }
            }

            private C1973c() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.j(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/okta/webauthenticationui/b$c$d;", "Lcom/okta/webauthenticationui/b$c;", "", "urlString", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "web-authentication-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class d extends c {
            public static final Parcelable.Creator<d> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String urlString;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<d> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final d createFromParcel(Parcel parcel) {
                    Intrinsics.j(parcel, "parcel");
                    return new d(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final d[] newArray(int i10) {
                    return new d[i10];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.j(dest, "dest");
                dest.writeString(this.urlString);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String urlString) {
                super(null);
                Intrinsics.j(urlString, "urlString");
                this.urlString = urlString;
            }

            /* renamed from: a, reason: from getter */
            public final String getUrlString() {
                return this.urlString;
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public b(C5996L savedStateHandle) {
        Intrinsics.j(savedStateHandle, "savedStateHandle");
        this.savedStateHandle = savedStateHandle;
        this.stateLiveData = savedStateHandle.c("FOREGROUND_STATE_LIVE_DATA_KEY", c.C1972b.f119892a);
        C16648k.d(d0.a(this), null, null, new a(null), 3, null);
    }

    public final void o() {
        f119886d.a(null);
    }

    public final AbstractC5985A<c> p() {
        return this.stateLiveData;
    }

    public final void q(Activity activity, String urlString) {
        Intrinsics.j(activity, "activity");
        Intrinsics.j(urlString, "urlString");
        this.savedStateHandle.f("FOREGROUND_STATE_LIVE_DATA_KEY", c.a.f119891a);
        if (f119886d.c(activity, HttpUrl.INSTANCE.c(urlString))) {
            return;
        }
        activity.finish();
    }

    public final void r(Uri data) {
        f119886d.a(data);
    }

    public final void s(Activity activity) {
        Intrinsics.j(activity, "activity");
        if (Intrinsics.e(this.stateLiveData.e(), c.a.f119891a)) {
            f119886d.a(null);
            activity.finish();
        }
    }
}
