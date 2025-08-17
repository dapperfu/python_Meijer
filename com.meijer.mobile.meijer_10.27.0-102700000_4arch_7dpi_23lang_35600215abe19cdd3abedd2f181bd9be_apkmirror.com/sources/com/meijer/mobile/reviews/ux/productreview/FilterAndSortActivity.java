package com.meijer.mobile.reviews.ux.productreview;

import Ji.LocalThemeScope;
import Jp.Filter;
import V2.CreationExtras;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import com.meijer.mobile.reviews.ux.productreview.AbstractC12708a;
import com.meijer.mobile.reviews.ux.productreview.FilterAndSortActivity;
import com.meijer.mobile.reviews.ux.productreview.T;
import e.C13589e;
import java.util.ArrayList;
import java.util.Set;
import kotlin.AbstractC14653B;
import kotlin.C14677u;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/meijer/mobile/reviews/ux/productreview/FilterAndSortActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/meijer/mobile/reviews/ux/productreview/T;", "v", "Lkotlin/Lazy;", "r1", "()Lcom/meijer/mobile/reviews/ux/productreview/T;", "vmFilterSort", "w", "a", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class FilterAndSortActivity extends Hilt_FilterAndSortActivity {

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: x, reason: collision with root package name */
    public static final int f115425x = 8;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final Lazy vmFilterSort = new androidx.view.e0(Reflection.b(T.class), new d(this), new c(this), new e(null, this));

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/reviews/ux/productreview/FilterAndSortActivity$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ljava/util/ArrayList;", "LJp/a;", "Lkotlin/collections/ArrayList;", "filterArray", "LJp/b;", "sortBy", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Ljava/util/ArrayList;LJp/b;)Landroid/content/Intent;", "", "EXTRA_FILTER_RESULT", "Ljava/lang/String;", "EXTRA_SORT_RESULT", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.reviews.ux.productreview.FilterAndSortActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Intent a(Context context, ArrayList<Filter> filterArray, Jp.b sortBy) {
            Intrinsics.j(context, "context");
            Intent intentPutExtra = new Intent(context, (Class<?>) FilterAndSortActivity.class).putParcelableArrayListExtra("com.meijer.intent.extra.EXTRA_FILTER_RESULT", filterArray).putExtra("com.meijer.intent.extra.EXTRA_SORT_RESULT", sortBy);
            Intrinsics.i(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ FilterAndSortActivity f115428a;

            a(FilterAndSortActivity filterAndSortActivity) {
                this.f115428a = filterAndSortActivity;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(T.FilterAndSortState filterAndSortState, FilterAndSortActivity filterAndSortActivity) {
                Intent intent = new Intent();
                intent.putExtra("com.meijer.intent.extra.EXTRA_SORT_RESULT", filterAndSortState.getSortBy());
                intent.putParcelableArrayListExtra("com.meijer.intent.extra.EXTRA_FILTER_RESULT", new ArrayList<>(filterAndSortState.c()));
                filterAndSortActivity.setResult(-1, intent);
                filterAndSortActivity.finish();
                return Unit.f142422a;
            }

            public final void b(LocalThemeScope AdsTheme, Composer composer, int i10) {
                Intrinsics.j(AdsTheme, "$this$AdsTheme");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(904129085, i10, -1, "com.meijer.mobile.reviews.ux.productreview.FilterAndSortActivity.onCreate.<anonymous>.<anonymous> (FilterAndSortActivity.kt:73)");
                }
                C14677u c14677uE = j4.j.e(new AbstractC14653B[0], composer, 0);
                final T.FilterAndSortState filterAndSortState = (T.FilterAndSortState) androidx.compose.runtime.o1.b(this.f115428a.r1().o(), null, composer, 0, 1).getValue();
                T tR1 = this.f115428a.r1();
                composer.startReplaceGroup(-1633490746);
                boolean zD = composer.D(filterAndSortState) | composer.D(this.f115428a);
                final FilterAndSortActivity filterAndSortActivity = this.f115428a;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.reviews.ux.productreview.b
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return FilterAndSortActivity.b.a.c(filterAndSortState, filterAndSortActivity);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                C12720g.d(AdsTheme, c14677uE, tR1, filterAndSortState, (Function0) objB, composer, LocalThemeScope.f15770g | (i10 & 14));
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                b(localThemeScope, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        b() {
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1590846482, i10, -1, "com.meijer.mobile.reviews.ux.productreview.FilterAndSortActivity.onCreate.<anonymous> (FilterAndSortActivity.kt:72)");
            }
            Ji.K.b(null, ComposableLambdaKt.c(904129085, true, new a(FilterAndSortActivity.this), composer, 54), composer, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f115429f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f115429f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f115429f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f115430f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f115430f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f115430f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f115431f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f115432g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f115431f = function0;
            this.f115432g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f115431f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f115432g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T r1() {
        return (T) this.vmFilterSort.getValue();
    }

    @Override // com.meijer.mobile.reviews.ux.productreview.Hilt_FilterAndSortActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        ArrayList parcelableArrayListExtra;
        Object serializableExtra;
        Set setO1;
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        Intrinsics.i(intent, "getIntent(...)");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            parcelableArrayListExtra = intent.getParcelableArrayListExtra("com.meijer.intent.extra.EXTRA_FILTER_RESULT", Filter.class);
        } else {
            parcelableArrayListExtra = intent.getParcelableArrayListExtra("com.meijer.intent.extra.EXTRA_FILTER_RESULT");
        }
        Intent intent2 = getIntent();
        Intrinsics.i(intent2, "getIntent(...)");
        if (i10 >= 33) {
            serializableExtra = intent2.getSerializableExtra("com.meijer.intent.extra.EXTRA_SORT_RESULT", Jp.b.class);
        } else {
            Object serializableExtra2 = intent2.getSerializableExtra("com.meijer.intent.extra.EXTRA_SORT_RESULT");
            if (!(serializableExtra2 instanceof Jp.b)) {
                serializableExtra2 = null;
            }
            serializableExtra = (Jp.b) serializableExtra2;
        }
        Jp.b bVar = (Jp.b) serializableExtra;
        T tR1 = r1();
        if (parcelableArrayListExtra != null) {
            setO1 = CollectionsKt.o1(parcelableArrayListExtra);
        } else {
            setO1 = null;
        }
        tR1.p(new AbstractC12708a.SetFilterAndSort(setO1, bVar));
        getLifecycle().a(r1());
        C13589e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-1590846482, true, new b()), 1, null);
    }
}
