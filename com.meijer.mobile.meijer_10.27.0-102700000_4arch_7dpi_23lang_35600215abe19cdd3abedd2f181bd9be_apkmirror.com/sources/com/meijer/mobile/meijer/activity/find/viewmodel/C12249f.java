package com.meijer.mobile.meijer.activity.find.viewmodel;

import Co.Department;
import Mn.AbstractC4257l2;
import android.view.View;
import com.meijer.mobile.meijer.activity.find.viewmodel.C12229d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import nu.C15949d;
import ou.AbstractC16177a;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00019B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001c\u001a\u00020\u001b2\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010$\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0012H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001e\u00104\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001f028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00103R\u0011\u00108\u001a\u0002058F¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006:"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/f;", "Lou/a;", "LMn/l2;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e;", "departmentDecorator", "Lkotlin/Function1;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/d$a$a;", "", "actionHandler", "", "activeDepartments", "LCo/b;", "currentDepartment", "<init>", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/e;Lkotlin/jvm/functions/Function1;Ljava/util/List;LCo/b;)V", "", "i", "()J", "", "j", "()I", "Landroid/view/View;", "view", "D", "(Landroid/view/View;)LMn/l2;", "Lnu/h;", "other", "", "m", "(Lnu/h;)Z", "itemView", "Lou/b;", "y", "(Landroid/view/View;)Lou/b;", "viewBinding", "position", "A", "(LMn/l2;I)V", "e", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e;", "f", "Lkotlin/jvm/functions/Function1;", "g", "Ljava/util/List;", "B", "()Ljava/util/List;", "h", "LCo/b;", "getCurrentDepartment", "()LCo/b;", "Lnu/d;", "Lnu/d;", "adapter", "", "C", "()Ljava/lang/String;", "title", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C12249f extends AbstractC16177a<AbstractC4257l2> {

    /* renamed from: k, reason: collision with root package name */
    public static final int f108824k = 8;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final DepartmentItemDecorator departmentDecorator;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Function1<C12229d.a.GoTo, Unit> actionHandler;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List<DepartmentItemDecorator> activeDepartments;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Department currentDepartment;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final C15949d<ou.b<?>> adapter;

    /* JADX WARN: Multi-variable type inference failed */
    public C12249f(DepartmentItemDecorator departmentDecorator, Function1<? super C12229d.a.GoTo, Unit> actionHandler, List<DepartmentItemDecorator> activeDepartments, Department department) {
        Intrinsics.j(departmentDecorator, "departmentDecorator");
        Intrinsics.j(actionHandler, "actionHandler");
        Intrinsics.j(activeDepartments, "activeDepartments");
        this.departmentDecorator = departmentDecorator;
        this.actionHandler = actionHandler;
        this.activeDepartments = activeDepartments;
        this.currentDepartment = department;
        this.adapter = new C15949d<>();
    }

    @Override // ou.AbstractC16177a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public void u(AbstractC4257l2 viewBinding, int position) {
        Intrinsics.j(viewBinding, "viewBinding");
        viewBinding.f20783z.setAdapter(this.adapter);
        List listP0 = CollectionsKt.P0(CollectionsKt.e(this.departmentDecorator), this.departmentDecorator.a());
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listP0, 10));
        Iterator it = listP0.iterator();
        while (it.hasNext()) {
            arrayList.add(new C12229d((DepartmentItemDecorator) it.next(), this.actionHandler));
        }
        this.adapter.x(arrayList);
        if (this.departmentDecorator.getDepartment().getName().contentEquals("Departments")) {
            this.adapter.v(0);
        }
    }

    public final List<DepartmentItemDecorator> B() {
        return this.activeDepartments;
    }

    public final String C() {
        return this.departmentDecorator.getDepartment().getName();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ou.AbstractC16177a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public AbstractC4257l2 z(View view) {
        Intrinsics.j(view, "view");
        AbstractC4257l2 abstractC4257l2K0 = AbstractC4257l2.K0(view);
        Intrinsics.i(abstractC4257l2K0, "bind(...)");
        return abstractC4257l2K0;
    }

    @Override // nu.h
    public long i() {
        return this.departmentDecorator.getDepartment().getUrl() != null ? r0.hashCode() : 0;
    }

    @Override // nu.h
    /* renamed from: j */
    public int getLayoutId() {
        return com.meijer.mobile.meijer.V.f99332K0;
    }

    @Override // nu.h
    public boolean m(nu.h<?> other) {
        Intrinsics.j(other, "other");
        if (super.m(other)) {
            return true;
        }
        return (other instanceof C12249f) && Intrinsics.e(((C12249f) other).departmentDecorator, this.departmentDecorator);
    }

    @Override // ou.AbstractC16177a, nu.h
    /* renamed from: y */
    public ou.b<AbstractC4257l2> g(View itemView) {
        Intrinsics.j(itemView, "itemView");
        ou.b<AbstractC4257l2> bVarG = super.g(itemView);
        ((AbstractC4257l2) bVarG.f155251d).f20783z.addItemDecoration(new androidx.recyclerview.widget.i(itemView.getContext(), 1));
        Intrinsics.i(bVarG, "apply(...)");
        return bVarG;
    }
}
