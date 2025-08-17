package com.meijer.mobile.meijer.activity.personalized.modals;

import Mn.AbstractC4265n2;
import Qo.l;
import android.view.View;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ou.AbstractC16177a;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/d;", "Lou/a;", "LMn/n2;", "LQo/l;", "productQuery", "<init>", "(LQo/l;)V", "", "i", "()J", "", "j", "()I", "Landroid/view/View;", "view", "B", "(Landroid/view/View;)LMn/n2;", "viewBinding", "position", "", "A", "(LMn/n2;I)V", "e", "LQo/l;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C12443d extends AbstractC16177a<AbstractC4265n2> {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Qo.l productQuery;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.d$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[mk.d.values().length];
            try {
                iArr[mk.d.f150120a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[mk.d.f150121b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public C12443d(Qo.l productQuery) {
        Intrinsics.j(productQuery, "productQuery");
        this.productQuery = productQuery;
    }

    @Override // ou.AbstractC16177a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public void u(AbstractC4265n2 viewBinding, int position) {
        Intrinsics.j(viewBinding, "viewBinding");
        Qo.l lVar = this.productQuery;
        if (lVar instanceof l.Favorites) {
            viewBinding.f20813A.setText(com.meijer.mobile.meijer.Y.f99536E5);
            viewBinding.f20814z.setText(com.meijer.mobile.meijer.Y.f99517D5);
            return;
        }
        if (!(lVar instanceof l.Personalized)) {
            TextView topDesc = viewBinding.f20813A;
            Intrinsics.i(topDesc, "topDesc");
            topDesc.setVisibility(8);
            TextView bottomDesc = viewBinding.f20814z;
            Intrinsics.i(bottomDesc, "bottomDesc");
            bottomDesc.setVisibility(8);
            return;
        }
        int i10 = a.$EnumSwitchMapping$0[((l.Personalized) lVar).getCategory().ordinal()];
        if (i10 == 1) {
            viewBinding.f20813A.setText(com.meijer.mobile.meijer.Y.f99574G5);
            viewBinding.f20814z.setText(com.meijer.mobile.meijer.Y.f99555F5);
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            TextView topDesc2 = viewBinding.f20813A;
            Intrinsics.i(topDesc2, "topDesc");
            topDesc2.setVisibility(8);
            TextView bottomDesc2 = viewBinding.f20814z;
            Intrinsics.i(bottomDesc2, "bottomDesc");
            bottomDesc2.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ou.AbstractC16177a
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public AbstractC4265n2 z(View view) {
        Intrinsics.j(view, "view");
        AbstractC4265n2 abstractC4265n2K0 = AbstractC4265n2.K0(view);
        Intrinsics.i(abstractC4265n2K0, "bind(...)");
        return abstractC4265n2K0;
    }

    @Override // nu.h
    public long i() {
        return this.productQuery.hashCode();
    }

    @Override // nu.h
    public int j() {
        return com.meijer.mobile.meijer.V.f99334L0;
    }
}
