package p1;

import a1.d;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b1.AndroidVectorParser;
import b1.C6319c;
import io.constructor.data.local.PreferencesHelper;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.xmlpull.v1.XmlPullParserException;
import p1.C16334c;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\u000b\u001a\u00020\u0003*\u00020\u00002\u000e\b\u0002\u0010\b\u001a\b\u0018\u00010\u0006R\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a7\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\b\u001a\b\u0018\u00010\u0006R\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"La1/d$b;", "", PreferencesHelper.PREF_ID, "La1/d;", "b", "(La1/d$b;ILandroidx/compose/runtime/Composer;I)La1/d;", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "theme", "res", "resId", "c", "(La1/d$b;Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;I)La1/d;", "Landroid/content/res/XmlResourceParser;", "parser", "changingConfigurations", "Lp1/c$a;", "a", "(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;I)Lp1/c$a;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: p1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16339h {
    public static final a1.d c(d.Companion companion, Resources.Theme theme, Resources resources, int i10) throws XmlPullParserException, Resources.NotFoundException {
        TypedValue typedValue = new TypedValue();
        resources.getValue(i10, typedValue, true);
        XmlResourceParser xml = resources.getXml(i10);
        C6319c.j(xml);
        Unit unit = Unit.f143329a;
        return a(theme, resources, xml, typedValue.changingConfigurations).getImageVector();
    }

    public static final C16334c.ImageVectorEntry a(Resources.Theme theme, Resources resources, XmlResourceParser xmlResourceParser, int i10) throws XmlPullParserException, IOException {
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        AndroidVectorParser androidVectorParser = new AndroidVectorParser(xmlResourceParser, 0, 2, null);
        d.a aVarA = C6319c.a(androidVectorParser, resources, theme, attributeSetAsAttributeSet);
        int iG = 0;
        while (!C6319c.d(xmlResourceParser)) {
            iG = C6319c.g(androidVectorParser, resources, attributeSetAsAttributeSet, theme, aVarA, iG);
            xmlResourceParser.next();
        }
        return new C16334c.ImageVectorEntry(aVarA.f(), i10);
    }

    public static final a1.d b(d.Companion companion, int i10, Composer composer, int i11) throws XmlPullParserException, Resources.NotFoundException {
        if (ComposerKt.M()) {
            ComposerKt.U(44534090, i11, -1, "androidx.compose.ui.res.vectorResource (VectorResources.android.kt:47)");
        }
        Context context = (Context) composer.o(AndroidCompositionLocals_androidKt.g());
        boolean z10 = false;
        Resources resourcesA = C16337f.a(composer, 0);
        Resources.Theme theme = context.getTheme();
        Object configuration = resourcesA.getConfiguration();
        if ((((i11 & 112) ^ 48) > 32 && composer.d(i10)) || (i11 & 48) == 32) {
            z10 = true;
        }
        boolean zV = composer.V(resourcesA) | z10 | composer.V(theme) | composer.V(configuration);
        Object objB = composer.B();
        if (zV || objB == Composer.INSTANCE.a()) {
            objB = c(companion, theme, resourcesA, i10);
            composer.t(objB);
        }
        a1.d dVar = (a1.d) objB;
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return dVar;
    }
}
