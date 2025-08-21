package com.meijer.mobile.meijer.activity.find.viewmodel;

import Nn.AbstractC4213b1;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ku.AbstractC15424a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/d;", "Lku/a;", "LNn/b1;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e;", "departmentItemDecorator", "Lkotlin/Function1;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/d$a$a;", "", "actionHandler", "<init>", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/e;Lkotlin/jvm/functions/Function1;)V", "", "j", "()I", "", "i", "()J", "Landroid/view/View;", "view", "D", "(Landroid/view/View;)LNn/b1;", "viewBinding", "position", "B", "(LNn/b1;I)V", "e", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e;", "f", "Lkotlin/jvm/functions/Function1;", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C12354d extends AbstractC15424a<AbstractC4213b1> {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final DepartmentItemDecorator departmentItemDecorator;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Function1<a.GoTo, Unit> actionHandler;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/d$a;", "", "<init>", "()V", "a", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/d$a$a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.d$a */
    public static abstract class a {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/d$a$a;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/d$a;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e;", "departmentItemDecorator", "<init>", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e;", "()Lcom/meijer/mobile/meijer/activity/find/viewmodel/e;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.d$a$a, reason: collision with other inner class name and from toString */
        public static final /* data */ class GoTo extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final DepartmentItemDecorator departmentItemDecorator;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof GoTo) && Intrinsics.e(this.departmentItemDecorator, ((GoTo) other).departmentItemDecorator);
            }

            public int hashCode() {
                return this.departmentItemDecorator.hashCode();
            }

            public String toString() {
                return "GoTo(departmentItemDecorator=" + this.departmentItemDecorator + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GoTo(DepartmentItemDecorator departmentItemDecorator) {
                super(null);
                Intrinsics.j(departmentItemDecorator, "departmentItemDecorator");
                this.departmentItemDecorator = departmentItemDecorator;
            }

            /* renamed from: a, reason: from getter */
            public final DepartmentItemDecorator getDepartmentItemDecorator() {
                return this.departmentItemDecorator;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C12354d(DepartmentItemDecorator departmentItemDecorator, Function1<? super a.GoTo, Unit> actionHandler) {
        Intrinsics.j(departmentItemDecorator, "departmentItemDecorator");
        Intrinsics.j(actionHandler, "actionHandler");
        this.departmentItemDecorator = departmentItemDecorator;
        this.actionHandler = actionHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(C12354d c12354d, View view) {
        c12354d.actionHandler.invoke(new a.GoTo(c12354d.departmentItemDecorator));
    }

    @Override // ku.AbstractC15424a
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public void u(AbstractC4213b1 viewBinding, int position) {
        Intrinsics.j(viewBinding, "viewBinding");
        MaterialButton departmentItem = viewBinding.f21815z;
        Intrinsics.i(departmentItem, "departmentItem");
        ck.d.g(departmentItem, this.departmentItemDecorator.getItemText());
        viewBinding.f21815z.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C12354d.C(this.f109003a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ku.AbstractC15424a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public AbstractC4213b1 z(View view) {
        Intrinsics.j(view, "view");
        AbstractC4213b1 abstractC4213b1M0 = AbstractC4213b1.M0(view);
        Intrinsics.i(abstractC4213b1M0, "bind(...)");
        return abstractC4213b1M0;
    }

    @Override // ju.h
    public long i() {
        return this.departmentItemDecorator.hashCode();
    }

    @Override // ju.h
    public int j() {
        return com.meijer.mobile.meijer.V.f100223b0;
    }
}
