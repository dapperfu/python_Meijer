package com.google.maps.android.compose;

import Od.C4455c;
import Od.C4456d;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.AbstractC5869k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;

@Metadata(d1 = {"\u00002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u001a1\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000\"\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013²\u0006\u0012\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\nX\u008a\u0084\u0002"}, d2 = {"", "", "keys", "Lkotlin/Function0;", "", "content", "LOd/c;", "rememberComposeBitmapDescriptor", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)LOd/c;", "Landroid/view/ViewGroup;", "parent", "Landroidx/compose/runtime/k;", "compositionContext", "renderComposableToBitmapDescriptor", "(Landroid/view/ViewGroup;Landroidx/compose/runtime/k;Lkotlin/jvm/functions/Function2;)LOd/c;", "", "measureSpec", "I", "currentContent", "maps-compose_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class RememberComposeBitmapDescriptorKt {
    private static final int measureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);

    public static final C4455c rememberComposeBitmapDescriptor(Object[] keys, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i10) {
        Intrinsics.j(keys, "keys");
        Intrinsics.j(content, "content");
        if (ComposerKt.M()) {
            ComposerKt.U(1871105836, i10, -1, "com.google.maps.android.compose.rememberComposeBitmapDescriptor (RememberComposeBitmapDescriptor.kt:21)");
        }
        Object objO = composer.o(AndroidCompositionLocals_androidKt.k());
        Intrinsics.h(objO, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) objO;
        AbstractC5869k abstractC5869kD = C5859f.d(composer, 0);
        androidx.compose.runtime.z1 z1VarP = androidx.compose.runtime.o1.p(content, composer, (i10 >> 3) & 14);
        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
        spreadBuilder.a(viewGroup);
        spreadBuilder.a(abstractC5869kD);
        spreadBuilder.a(rememberComposeBitmapDescriptor$lambda$0(z1VarP));
        spreadBuilder.b(keys);
        boolean zV = false;
        for (Object obj : spreadBuilder.d(new Object[spreadBuilder.c()])) {
            zV |= composer.V(obj);
        }
        Object objB = composer.B();
        if (zV || objB == Composer.INSTANCE.a()) {
            objB = renderComposableToBitmapDescriptor(viewGroup, abstractC5869kD, rememberComposeBitmapDescriptor$lambda$0(z1VarP));
            composer.t(objB);
        }
        C4455c c4455c = (C4455c) objB;
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return c4455c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4455c renderComposableToBitmapDescriptor(ViewGroup viewGroup, AbstractC5869k abstractC5869k, Function2<? super Composer, ? super Integer, Unit> function2) {
        Context context = viewGroup.getContext();
        Intrinsics.i(context, "getContext(...)");
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        composeView.setParentCompositionContext(abstractC5869k);
        composeView.setContent(function2);
        viewGroup.addView(composeView);
        int i10 = measureSpec;
        composeView.measure(i10, i10);
        if (composeView.getMeasuredWidth() == 0 || composeView.getMeasuredHeight() == 0) {
            throw new IllegalStateException("The ComposeView was measured to have a width or height of zero. Make sure that the content has a non-zero size.");
        }
        composeView.layout(0, 0, composeView.getMeasuredWidth(), composeView.getMeasuredHeight());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(composeView.getMeasuredWidth(), composeView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        composeView.draw(new Canvas(bitmapCreateBitmap));
        viewGroup.removeView(composeView);
        C4455c c4455cB = C4456d.b(bitmapCreateBitmap);
        Intrinsics.i(c4455cB, "fromBitmap(...)");
        return c4455cB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function2<Composer, Integer, Unit> rememberComposeBitmapDescriptor$lambda$0(androidx.compose.runtime.z1<? extends Function2<? super Composer, ? super Integer, Unit>> z1Var) {
        return (Function2) z1Var.getValue();
    }
}
