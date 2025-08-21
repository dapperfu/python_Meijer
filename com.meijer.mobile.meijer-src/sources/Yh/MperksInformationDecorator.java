package Yh;

import Ik.Validation;
import ai.AbstractC5694d;
import bk.AbstractC6392a;
import com.medallia.digital.mobilesdk.l3;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B[\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\u00020\u00002\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016Jd\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0017\u0010/\u001a\u0004\b2\u00101R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b$\u00104\u001a\u0004\b7\u00106R\u001f\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\f8\u0006¢\u0006\f\n\u0004\b7\u00104\u001a\u0004\b8\u00106R$\u0010;\u001a\u0012\u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010:0\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u00106¨\u0006<"}, d2 = {"LYh/d;", "", "Lai/d;", "Lai/d$a;", "currentPin", "Lai/d$b;", "newPin", "Lbk/a;", "loadingErrorMessage", "", "isLoading", "isQuickIDEnabled", "", "LPj/a;", "loadingStates", "errorStates", "<init>", "(Lai/d$a;Lai/d$b;Lbk/a;ZZLjava/util/List;Ljava/util/List;)V", "field", "m", "(Lai/d;)LYh/d;", "n", "()LYh/d;", "e", "(Lai/d$a;Lai/d$b;Lbk/a;ZZLjava/util/List;Ljava/util/List;)LYh/d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lai/d$a;", "g", "()Lai/d$a;", "b", "Lai/d$b;", "j", "()Lai/d$b;", "c", "Lbk/a;", "i", "()Lbk/a;", "d", "Z", "k", "()Z", "l", "f", "Ljava/util/List;", "getLoadingStates", "()Ljava/util/List;", "h", "getFieldErrors", "fieldErrors", "LIk/b;", "validations", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Yh.d, reason: from toString */
/* loaded from: classes8.dex */
public final /* data */ class MperksInformationDecorator implements Ik.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5694d.CurrentPin currentPin;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5694d.NewPin newPin;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a loadingErrorMessage;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isQuickIDEnabled;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Pj.a> loadingStates;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Pj.a> errorStates;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final List<AbstractC6392a> fieldErrors;

    public MperksInformationDecorator() {
        this(null, null, null, false, false, null, null, l3.f93324d, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MperksInformationDecorator)) {
            return false;
        }
        MperksInformationDecorator mperksInformationDecorator = (MperksInformationDecorator) other;
        return Intrinsics.e(this.currentPin, mperksInformationDecorator.currentPin) && Intrinsics.e(this.newPin, mperksInformationDecorator.newPin) && Intrinsics.e(this.loadingErrorMessage, mperksInformationDecorator.loadingErrorMessage) && this.isLoading == mperksInformationDecorator.isLoading && this.isQuickIDEnabled == mperksInformationDecorator.isQuickIDEnabled && Intrinsics.e(this.loadingStates, mperksInformationDecorator.loadingStates) && Intrinsics.e(this.errorStates, mperksInformationDecorator.errorStates);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MperksInformationDecorator(AbstractC5694d.CurrentPin currentPin, AbstractC5694d.NewPin newPin, AbstractC6392a abstractC6392a, boolean z10, boolean z11, List<? extends Pj.a> loadingStates, List<? extends Pj.a> errorStates) {
        Intrinsics.j(currentPin, "currentPin");
        Intrinsics.j(newPin, "newPin");
        Intrinsics.j(loadingStates, "loadingStates");
        Intrinsics.j(errorStates, "errorStates");
        this.currentPin = currentPin;
        this.newPin = newPin;
        this.loadingErrorMessage = abstractC6392a;
        this.isLoading = z10;
        this.isQuickIDEnabled = z11;
        this.loadingStates = loadingStates;
        this.errorStates = errorStates;
        this.fieldErrors = CollectionsKt.p(currentPin.b(), newPin.b());
    }

    public static /* synthetic */ MperksInformationDecorator f(MperksInformationDecorator mperksInformationDecorator, AbstractC5694d.CurrentPin aVar, AbstractC5694d.NewPin bVar, AbstractC6392a abstractC6392a, boolean z10, boolean z11, List list, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = mperksInformationDecorator.currentPin;
        }
        if ((i10 & 2) != 0) {
            bVar = mperksInformationDecorator.newPin;
        }
        if ((i10 & 4) != 0) {
            abstractC6392a = mperksInformationDecorator.loadingErrorMessage;
        }
        if ((i10 & 8) != 0) {
            z10 = mperksInformationDecorator.isLoading;
        }
        if ((i10 & 16) != 0) {
            z11 = mperksInformationDecorator.isQuickIDEnabled;
        }
        if ((i10 & 32) != 0) {
            list = mperksInformationDecorator.loadingStates;
        }
        if ((i10 & 64) != 0) {
            list2 = mperksInformationDecorator.errorStates;
        }
        List list3 = list;
        List list4 = list2;
        boolean z12 = z11;
        AbstractC6392a abstractC6392a2 = abstractC6392a;
        return mperksInformationDecorator.e(aVar, bVar, abstractC6392a2, z10, z12, list3, list4);
    }

    @Override // Ik.a
    public List<Validation<? extends Object>> a() {
        return CollectionsKt.p(this.currentPin.c(), this.newPin.c());
    }

    public final MperksInformationDecorator e(AbstractC5694d.CurrentPin currentPin, AbstractC5694d.NewPin newPin, AbstractC6392a loadingErrorMessage, boolean isLoading, boolean isQuickIDEnabled, List<? extends Pj.a> loadingStates, List<? extends Pj.a> errorStates) {
        Intrinsics.j(currentPin, "currentPin");
        Intrinsics.j(newPin, "newPin");
        Intrinsics.j(loadingStates, "loadingStates");
        Intrinsics.j(errorStates, "errorStates");
        return new MperksInformationDecorator(currentPin, newPin, loadingErrorMessage, isLoading, isQuickIDEnabled, loadingStates, errorStates);
    }

    /* renamed from: g, reason: from getter */
    public final AbstractC5694d.CurrentPin getCurrentPin() {
        return this.currentPin;
    }

    public final List<Pj.a> h() {
        return this.errorStates;
    }

    public int hashCode() {
        int iHashCode = ((this.currentPin.hashCode() * 31) + this.newPin.hashCode()) * 31;
        AbstractC6392a abstractC6392a = this.loadingErrorMessage;
        return ((((((((iHashCode + (abstractC6392a == null ? 0 : abstractC6392a.hashCode())) * 31) + Boolean.hashCode(this.isLoading)) * 31) + Boolean.hashCode(this.isQuickIDEnabled)) * 31) + this.loadingStates.hashCode()) * 31) + this.errorStates.hashCode();
    }

    /* renamed from: i, reason: from getter */
    public final AbstractC6392a getLoadingErrorMessage() {
        return this.loadingErrorMessage;
    }

    /* renamed from: j, reason: from getter */
    public final AbstractC5694d.NewPin getNewPin() {
        return this.newPin;
    }

    /* renamed from: k, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: l, reason: from getter */
    public final boolean getIsQuickIDEnabled() {
        return this.isQuickIDEnabled;
    }

    public MperksInformationDecorator m(AbstractC5694d<?> field) {
        Intrinsics.j(field, "field");
        if (field instanceof AbstractC5694d.CurrentPin) {
            AbstractC5694d.CurrentPin aVar = (AbstractC5694d.CurrentPin) field;
            return aVar.c().e().length() <= 4 ? f(this, aVar.f(), null, null, false, false, null, null, 126, null) : f(this, this.currentPin.f(), null, null, false, false, null, null, 126, null);
        }
        if (!(field instanceof AbstractC5694d.NewPin)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC5694d.NewPin bVar = (AbstractC5694d.NewPin) field;
        return bVar.c().e().length() <= 4 ? f(this, null, bVar.f(), null, false, false, null, null, 125, null) : f(this, null, this.newPin.f(), null, false, false, null, null, 125, null);
    }

    public MperksInformationDecorator n() {
        return f(this, this.currentPin.f(), this.newPin.f(), null, false, false, null, null, 124, null);
    }

    public String toString() {
        return "MperksInformationDecorator(currentPin=" + this.currentPin + ", newPin=" + this.newPin + ", loadingErrorMessage=" + this.loadingErrorMessage + ", isLoading=" + this.isLoading + ", isQuickIDEnabled=" + this.isQuickIDEnabled + ", loadingStates=" + this.loadingStates + ", errorStates=" + this.errorStates + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ MperksInformationDecorator(AbstractC5694d.CurrentPin aVar, AbstractC5694d.NewPin bVar, AbstractC6392a abstractC6392a, boolean z10, boolean z11, List list, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        int i11 = 1;
        this((i10 & 1) != 0 ? new AbstractC5694d.CurrentPin(null, i11, 0 == true ? 1 : 0) : aVar, (i10 & 2) != 0 ? new AbstractC5694d.NewPin(0 == true ? 1 : 0, i11, 0 == true ? 1 : 0) : bVar, (i10 & 4) != 0 ? null : abstractC6392a, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? false : z11, (i10 & 32) != 0 ? CollectionsKt.m() : list, (i10 & 64) != 0 ? CollectionsKt.m() : list2);
    }
}
