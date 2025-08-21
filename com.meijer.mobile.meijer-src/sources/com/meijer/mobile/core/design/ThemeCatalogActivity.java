package com.meijer.mobile.core.design;

import Bj.b;
import Cj.k;
import Dj.J;
import Dj.n;
import Dj.z;
import Oj.a;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.d;
import com.meijer.mobile.core.design.ThemeCatalogActivity;
import ee.C13790a;
import ju.C15069d;
import ju.g;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0018\u001a\u00020\u00138VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/meijer/mobile/core/design/ThemeCatalogActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "LBj/b;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "LOj/a;", "r", "LOj/a;", "binding", "Lju/d;", "Lju/g;", "s", "Lju/d;", "pagerAdapter", "Lcom/google/android/material/appbar/MaterialToolbar;", "t", "Lkotlin/Lazy;", "x1", "()Lcom/google/android/material/appbar/MaterialToolbar;", "toolbar", "Lee/a;", "u", "w1", "()Lee/a;", "closeBadge", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ThemeCatalogActivity extends AppCompatActivity implements b {

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private a binding;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final C15069d<g> pagerAdapter = new C15069d<>();

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Lazy toolbar = LazyKt.b(new Function0() { // from class: Cj.v
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ThemeCatalogActivity.B1(this.f5178a);
        }
    });

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final Lazy closeBadge = LazyKt.b(new Function0() { // from class: Cj.w
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ThemeCatalogActivity.v1(this.f5179a);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A1(TabLayout.f tab, int i10) {
        String str;
        Intrinsics.j(tab, "tab");
        if (i10 == 0) {
            str = "Content";
        } else if (i10 == 1) {
            str = "Buttons";
        } else if (i10 == 2) {
            str = "Text Fields";
        } else if (i10 != 3) {
            str = "Item " + (i10 + 1);
        } else {
            str = "Icons";
        }
        tab.r(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MaterialToolbar B1(ThemeCatalogActivity themeCatalogActivity) {
        return (MaterialToolbar) themeCatalogActivity.findViewById(k.f4930i1);
    }

    private final C13790a w1() {
        return (C13790a) this.closeBadge.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean z1(ThemeCatalogActivity themeCatalogActivity, MenuItem item) {
        Intrinsics.j(item, "item");
        int itemId = item.getItemId();
        a aVar = null;
        if (itemId == k.f4958s0) {
            a aVar2 = themeCatalogActivity.binding;
            if (aVar2 == null) {
                Intrinsics.x("binding");
            } else {
                aVar = aVar2;
            }
            Snackbar.r0(aVar.getRoot(), "Click " + ((Object) item.getTitle()), 0).c0();
            themeCatalogActivity.w1().R(themeCatalogActivity.w1().o() + 1);
            themeCatalogActivity.w1().V(true);
            return true;
        }
        if (itemId != k.f4960t0) {
            return false;
        }
        a aVar3 = themeCatalogActivity.binding;
        if (aVar3 == null) {
            Intrinsics.x("binding");
        } else {
            aVar = aVar3;
        }
        Snackbar.r0(aVar.getRoot(), "Click " + ((Object) item.getTitle()), 0).c0();
        themeCatalogActivity.w1().d();
        return true;
    }

    @Override // Bj.b
    /* renamed from: x1, reason: merged with bridge method [inline-methods] */
    public MaterialToolbar y() {
        Object value = this.toolbar.getValue();
        Intrinsics.i(value, "getValue(...)");
        return (MaterialToolbar) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C13790a v1(ThemeCatalogActivity themeCatalogActivity) {
        return C13790a.e(themeCatalogActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y1(ThemeCatalogActivity themeCatalogActivity) {
        themeCatalogActivity.onSupportNavigateUp();
        return Unit.f143329a;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        a aVarC = a.c(getLayoutInflater());
        this.binding = aVarC;
        a aVar = null;
        if (aVarC == null) {
            Intrinsics.x("binding");
            aVarC = null;
        }
        setContentView(aVarC.getRoot());
        b.o(this, 0, 0, new Function0() { // from class: Cj.s
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ThemeCatalogActivity.y1(this.f5176a);
            }
        }, 3, null);
        y().setOnMenuItemClickListener(new Toolbar.h() { // from class: Cj.t
            @Override // androidx.appcompat.widget.Toolbar.h
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return ThemeCatalogActivity.z1(this.f5177a, menuItem);
            }
        });
        this.pagerAdapter.c(new J());
        this.pagerAdapter.c(new Dj.k());
        this.pagerAdapter.c(new z());
        this.pagerAdapter.c(new n());
        a aVar2 = this.binding;
        if (aVar2 == null) {
            Intrinsics.x("binding");
            aVar2 = null;
        }
        aVar2.f24318d.setAdapter(this.pagerAdapter);
        a aVar3 = this.binding;
        if (aVar3 == null) {
            Intrinsics.x("binding");
            aVar3 = null;
        }
        TabLayout tabLayout = aVar3.f24316b;
        a aVar4 = this.binding;
        if (aVar4 == null) {
            Intrinsics.x("binding");
        } else {
            aVar = aVar4;
        }
        new d(tabLayout, aVar.f24318d, new d.b() { // from class: Cj.u
            @Override // com.google.android.material.tabs.d.b
            public final void onConfigureTab(TabLayout.f fVar, int i10) {
                ThemeCatalogActivity.A1(fVar, i10);
            }
        }).a();
    }
}
