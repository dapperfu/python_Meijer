package com.meijer.mobile.accounts.ux.createaccount;

import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import pv.C16555H;
import pv.C16563h;
import pv.InterfaceC16548A;
import pv.InterfaceC16553F;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\nB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\n\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/meijer/mobile/accounts/ux/createaccount/t;", "", "<init>", "()V", "Lcom/meijer/mobile/accounts/ux/createaccount/t$a;", "screen", "", "b", "(Lcom/meijer/mobile/accounts/ux/createaccount/t$a;)V", "Lpv/A;", "a", "Lpv/A;", "_screenFlow", "Lpv/F;", "Lpv/F;", "()Lpv/F;", "screenFlow", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16548A<a> _screenFlow;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16553F<a> screenFlow;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0006\tB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lcom/meijer/mobile/accounts/ux/createaccount/t$a;", "", "", PlaceTypes.ROUTE, "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "Lcom/meijer/mobile/accounts/ux/createaccount/t$a$a;", "Lcom/meijer/mobile/accounts/ux/createaccount/t$a$b;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String route;

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/accounts/ux/createaccount/t$a$a;", "Lcom/meijer/mobile/accounts/ux/createaccount/t$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.accounts.ux.createaccount.t$a$a, reason: collision with other inner class name */
        public static final /* data */ class C1339a extends a {

            /* renamed from: b, reason: collision with root package name */
            public static final C1339a f95222b = new C1339a();

            public boolean equals(Object other) {
                return this == other || (other instanceof C1339a);
            }

            public int hashCode() {
                return -38461483;
            }

            public String toString() {
                return "CreateAccount";
            }

            private C1339a() {
                super("create_account", null);
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/accounts/ux/createaccount/t$a$b;", "Lcom/meijer/mobile/accounts/ux/createaccount/t$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class b extends a {

            /* renamed from: b, reason: collision with root package name */
            public static final b f95223b = new b();

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return -148792340;
            }

            public String toString() {
                return "Education";
            }

            private b() {
                super("education", null);
            }
        }

        public /* synthetic */ a(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private a(String str) {
            this.route = str;
        }

        /* renamed from: a, reason: from getter */
        public final String getRoute() {
            return this.route;
        }
    }

    public final InterfaceC16553F<a> a() {
        return this.screenFlow;
    }

    public final void b(a screen) {
        Intrinsics.j(screen, "screen");
        this._screenFlow.b(screen);
    }

    public t() {
        InterfaceC16548A<a> interfaceC16548AB = C16555H.b(0, 1, null, 5, null);
        this._screenFlow = interfaceC16548AB;
        this.screenFlow = C16563h.b(interfaceC16548AB);
    }
}
