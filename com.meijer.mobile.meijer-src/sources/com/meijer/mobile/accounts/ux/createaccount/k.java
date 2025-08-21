package com.meijer.mobile.accounts.ux.createaccount;

import Uh.CreateAccountAppBarDecorator;
import bk.AbstractC6392a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l6.InterfaceC15469m;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\b\t\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/meijer/mobile/accounts/ux/createaccount/k;", "", "<init>", "()V", "LUh/a;", "a", "()LUh/a;", "appBarDecorator", "c", "b", "Lcom/meijer/mobile/accounts/ux/createaccount/k$a;", "Lcom/meijer/mobile/accounts/ux/createaccount/k$b;", "Lcom/meijer/mobile/accounts/ux/createaccount/k$c;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class k {

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/meijer/mobile/accounts/ux/createaccount/k$a;", "Lcom/meijer/mobile/accounts/ux/createaccount/k;", "LUh/a;", "appBarDecorator", "Ll6/m$e;", "lottieSpec", "Lbk/a;", "liveRegionDescription", "<init>", "(LUh/a;ILbk/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LUh/a;", "()LUh/a;", "b", "I", "c", "Lbk/a;", "()Lbk/a;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.accounts.ux.createaccount.k$a, reason: from toString */
    public static final /* data */ class Animation extends k {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final CreateAccountAppBarDecorator appBarDecorator;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int lottieSpec;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6392a liveRegionDescription;

        public /* synthetic */ Animation(CreateAccountAppBarDecorator createAccountAppBarDecorator, int i10, AbstractC6392a abstractC6392a, DefaultConstructorMarker defaultConstructorMarker) {
            this(createAccountAppBarDecorator, i10, abstractC6392a);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Animation)) {
                return false;
            }
            Animation animation = (Animation) other;
            return Intrinsics.e(this.appBarDecorator, animation.appBarDecorator) && InterfaceC15469m.e.d(this.lottieSpec, animation.lottieSpec) && Intrinsics.e(this.liveRegionDescription, animation.liveRegionDescription);
        }

        public int hashCode() {
            return (((this.appBarDecorator.hashCode() * 31) + InterfaceC15469m.e.e(this.lottieSpec)) * 31) + this.liveRegionDescription.hashCode();
        }

        public String toString() {
            return "Animation(appBarDecorator=" + this.appBarDecorator + ", lottieSpec=" + ((Object) InterfaceC15469m.e.f(this.lottieSpec)) + ", liveRegionDescription=" + this.liveRegionDescription + ')';
        }

        public /* synthetic */ Animation(CreateAccountAppBarDecorator createAccountAppBarDecorator, int i10, AbstractC6392a abstractC6392a, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? new CreateAccountAppBarDecorator(null, false, false, 1, null) : createAccountAppBarDecorator, (i11 & 2) != 0 ? InterfaceC15469m.e.b(Gh.g.f12663a) : i10, (i11 & 4) != 0 ? AbstractC6392a.INSTANCE.d(Gh.h.f12958q, new Object[0]) : abstractC6392a, null);
        }

        @Override // com.meijer.mobile.accounts.ux.createaccount.k
        /* renamed from: a, reason: from getter */
        public CreateAccountAppBarDecorator getAppBarDecorator() {
            return this.appBarDecorator;
        }

        /* renamed from: b, reason: from getter */
        public final AbstractC6392a getLiveRegionDescription() {
            return this.liveRegionDescription;
        }

        /* renamed from: c, reason: from getter */
        public final int getLottieSpec() {
            return this.lottieSpec;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private Animation(CreateAccountAppBarDecorator appBarDecorator, int i10, AbstractC6392a liveRegionDescription) {
            super(null);
            Intrinsics.j(appBarDecorator, "appBarDecorator");
            Intrinsics.j(liveRegionDescription, "liveRegionDescription");
            this.appBarDecorator = appBarDecorator;
            this.lottieSpec = i10;
            this.liveRegionDescription = liveRegionDescription;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/accounts/ux/createaccount/k$b;", "Lcom/meijer/mobile/accounts/ux/createaccount/k;", "LUh/a;", "appBarDecorator", "<init>", "(LUh/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LUh/a;", "()LUh/a;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.accounts.ux.createaccount.k$b, reason: from toString */
    public static final /* data */ class FormFields extends k {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final CreateAccountAppBarDecorator appBarDecorator;

        /* JADX WARN: Multi-variable type inference failed */
        public FormFields() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FormFields) && Intrinsics.e(this.appBarDecorator, ((FormFields) other).appBarDecorator);
        }

        public int hashCode() {
            return this.appBarDecorator.hashCode();
        }

        public String toString() {
            return "FormFields(appBarDecorator=" + this.appBarDecorator + ')';
        }

        public /* synthetic */ FormFields(CreateAccountAppBarDecorator createAccountAppBarDecorator, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new CreateAccountAppBarDecorator(null, false, false, 7, null) : createAccountAppBarDecorator);
        }

        @Override // com.meijer.mobile.accounts.ux.createaccount.k
        /* renamed from: a, reason: from getter */
        public CreateAccountAppBarDecorator getAppBarDecorator() {
            return this.appBarDecorator;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FormFields(CreateAccountAppBarDecorator appBarDecorator) {
            super(null);
            Intrinsics.j(appBarDecorator, "appBarDecorator");
            this.appBarDecorator = appBarDecorator;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/accounts/ux/createaccount/k$c;", "Lcom/meijer/mobile/accounts/ux/createaccount/k;", "LUh/a;", "appBarDecorator", "<init>", "(LUh/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LUh/a;", "()LUh/a;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.accounts.ux.createaccount.k$c, reason: from toString */
    public static final /* data */ class Loading extends k {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final CreateAccountAppBarDecorator appBarDecorator;

        /* JADX WARN: Multi-variable type inference failed */
        public Loading() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loading) && Intrinsics.e(this.appBarDecorator, ((Loading) other).appBarDecorator);
        }

        public int hashCode() {
            return this.appBarDecorator.hashCode();
        }

        public String toString() {
            return "Loading(appBarDecorator=" + this.appBarDecorator + ')';
        }

        public /* synthetic */ Loading(CreateAccountAppBarDecorator createAccountAppBarDecorator, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new CreateAccountAppBarDecorator(null, false, false, 5, null) : createAccountAppBarDecorator);
        }

        @Override // com.meijer.mobile.accounts.ux.createaccount.k
        /* renamed from: a, reason: from getter */
        public CreateAccountAppBarDecorator getAppBarDecorator() {
            return this.appBarDecorator;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loading(CreateAccountAppBarDecorator appBarDecorator) {
            super(null);
            Intrinsics.j(appBarDecorator, "appBarDecorator");
            this.appBarDecorator = appBarDecorator;
        }
    }

    public /* synthetic */ k(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public abstract CreateAccountAppBarDecorator getAppBarDecorator();

    private k() {
    }
}
