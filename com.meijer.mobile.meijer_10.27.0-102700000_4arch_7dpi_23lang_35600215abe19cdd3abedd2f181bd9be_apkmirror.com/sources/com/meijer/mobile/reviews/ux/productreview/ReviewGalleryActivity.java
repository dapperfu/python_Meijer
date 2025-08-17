package com.meijer.mobile.reviews.ux.productreview;

import Ji.LocalThemeScope;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.reviews.ux.productreview.ReviewGalleryActivity;
import e.C13589e;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014¨\u0006\b"}, d2 = {"Lcom/meijer/mobile/reviews/ux/productreview/ReviewGalleryActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ReviewGalleryActivity extends Hilt_ReviewGalleryActivity {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f115557a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList<String> f115558b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ReviewGalleryActivity f115559c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.reviews.ux.productreview.ReviewGalleryActivity$a$a, reason: collision with other inner class name */
        static final class C1849a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f115560a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ArrayList<String> f115561b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ReviewGalleryActivity f115562c;

            C1849a(int i10, ArrayList<String> arrayList, ReviewGalleryActivity reviewGalleryActivity) {
                this.f115560a = i10;
                this.f115561b = arrayList;
                this.f115562c = reviewGalleryActivity;
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
                    ComposerKt.U(1344279427, i10, -1, "com.meijer.mobile.reviews.ux.productreview.ReviewGalleryActivity.onCreate.<anonymous>.<anonymous> (ReviewGalleryActivity.kt:90)");
                }
                Modifier modifierFsUnmask = FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE);
                int i11 = this.f115560a;
                ArrayList<String> arrayList = this.f115561b;
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(this.f115562c);
                final ReviewGalleryActivity reviewGalleryActivity = this.f115562c;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.reviews.ux.productreview.W0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ReviewGalleryActivity.a.C1849a.c(reviewGalleryActivity);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                g1.j(AdsTheme, modifierFsUnmask, i11, arrayList, (Function0) objB, composer, LocalThemeScope.f15770g | (i10 & 14), 0);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                b(localThemeScope, composer, num.intValue());
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(ReviewGalleryActivity reviewGalleryActivity) {
                reviewGalleryActivity.finish();
                return Unit.f142422a;
            }
        }

        a(int i10, ArrayList<String> arrayList, ReviewGalleryActivity reviewGalleryActivity) {
            this.f115557a = i10;
            this.f115558b = arrayList;
            this.f115559c = reviewGalleryActivity;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1150696140, i10, -1, "com.meijer.mobile.reviews.ux.productreview.ReviewGalleryActivity.onCreate.<anonymous> (ReviewGalleryActivity.kt:89)");
            }
            Ji.K.b(null, ComposableLambdaKt.c(1344279427, true, new C1849a(this.f115557a, this.f115558b, this.f115559c), composer, 54), composer, 48, 1);
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

    @Override // com.meijer.mobile.reviews.ux.productreview.Hilt_ReviewGalleryActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int intExtra = getIntent().getIntExtra("com.meijer.intent.extra.IMAGE_POSITION_REVIEW", 0);
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("com.meijer.intent.extra.IMAGES_LIST_REVIEW");
        if (stringArrayListExtra == null) {
            stringArrayListExtra = new ArrayList<>();
        }
        C13589e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-1150696140, true, new a(intExtra, stringArrayListExtra, this)), 1, null);
    }
}
