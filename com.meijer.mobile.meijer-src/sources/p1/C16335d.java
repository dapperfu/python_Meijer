package p1;

import V0.InterfaceC5459f1;
import Z0.BitmapPainter;
import a1.r;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ResourceResolutionException;
import b1.C6319c;
import io.constructor.data.local.PreferencesHelper;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParserException;
import p1.C16334c;

@Metadata(d1 = {"\u00000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a3\u0010\u000b\u001a\u00020\n2\n\u0010\u0007\u001a\u00060\u0005R\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"", PreferencesHelper.PREF_ID, "LZ0/c;", "c", "(ILandroidx/compose/runtime/Composer;I)LZ0/c;", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "theme", "res", "changingConfigurations", "La1/d;", "b", "(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;IILandroidx/compose/runtime/Composer;I)La1/d;", "", "path", "LV0/f1;", "a", "(Ljava/lang/CharSequence;Landroid/content/res/Resources;I)LV0/f1;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: p1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16335d {
    private static final InterfaceC5459f1 a(CharSequence charSequence, Resources resources, int i10) {
        try {
            return C16333b.a(InterfaceC5459f1.INSTANCE, resources, i10);
        } catch (Exception e10) {
            throw new ResourceResolutionException("Error attempting to load resource: " + ((Object) charSequence), e10);
        }
    }

    private static final a1.d b(Resources.Theme theme, Resources resources, int i10, int i11, Composer composer, int i12) throws XmlPullParserException, Resources.NotFoundException, IOException {
        if (ComposerKt.M()) {
            ComposerKt.U(21855625, i12, -1, "androidx.compose.ui.res.loadVectorResource (PainterResources.android.kt:89)");
        }
        C16334c c16334c = (C16334c) composer.o(AndroidCompositionLocals_androidKt.h());
        C16334c.Key key = new C16334c.Key(theme, i10);
        C16334c.ImageVectorEntry imageVectorEntryB = c16334c.b(key);
        if (imageVectorEntryB == null) {
            XmlResourceParser xml = resources.getXml(i10);
            if (Intrinsics.e(C6319c.j(xml).getName(), "vector")) {
                imageVectorEntryB = C16339h.a(theme, resources, xml, i11);
                c16334c.d(key, imageVectorEntryB);
            } else {
                throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
            }
        }
        a1.d imageVector = imageVectorEntryB.getImageVector();
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return imageVector;
    }

    public static final Z0.c c(int i10, Composer composer, int i11) {
        Z0.c cVarG;
        if (ComposerKt.M()) {
            ComposerKt.U(473971343, i11, -1, "androidx.compose.ui.res.painterResource (PainterResources.android.kt:56)");
        }
        Context context = (Context) composer.o(AndroidCompositionLocals_androidKt.g());
        composer.o(AndroidCompositionLocals_androidKt.f());
        Resources resources = context.getResources();
        TypedValue typedValueB = ((C16336e) composer.o(AndroidCompositionLocals_androidKt.i())).b(resources, i10);
        CharSequence charSequence = typedValueB.string;
        boolean z10 = true;
        if (charSequence != null && StringsKt.h0(charSequence, ".xml", false, 2, null)) {
            composer.startReplaceGroup(-803043333);
            cVarG = r.g(b(context.getTheme(), resources, i10, typedValueB.changingConfigurations, composer, (i11 << 6) & 896), composer, 0);
            composer.P();
        } else {
            composer.startReplaceGroup(-802887899);
            Object theme = context.getTheme();
            boolean zV = composer.V(charSequence);
            if ((((i11 & 14) ^ 6) <= 4 || !composer.d(i10)) && (i11 & 6) != 4) {
                z10 = false;
            }
            boolean zV2 = composer.V(theme) | zV | z10;
            Object objB = composer.B();
            if (zV2 || objB == Composer.INSTANCE.a()) {
                objB = a(charSequence, resources, i10);
                composer.t(objB);
            }
            BitmapPainter bitmapPainter = new BitmapPainter((InterfaceC5459f1) objB, 0L, 0L, 6, null);
            composer.P();
            cVarG = bitmapPainter;
        }
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return cVarG;
    }
}
