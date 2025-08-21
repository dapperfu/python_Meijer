package r5;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import androidx.view.AbstractC6165l;
import androidx.view.InterfaceC6172s;
import b2.C6327h;
import j.C14879a;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.xmlpull.v1.XmlPullParserException;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\t\u001a\u00020\u0003*\u00020\u00062\b\b\u0001\u0010\u0002\u001a\u00020\u00012\f\u0010\b\u001a\b\u0018\u00010\u0007R\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0014\u001a\u00020\u0013*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroid/content/Context;", "", "resId", "Landroid/graphics/drawable/Drawable;", "a", "(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;", "Landroid/content/res/Resources;", "Landroid/content/res/Resources$Theme;", "theme", "b", "(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;", "resources", "d", "(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;", "Landroidx/lifecycle/l;", "c", "(Landroid/content/Context;)Landroidx/lifecycle/l;", "", "permission", "", "e", "(Landroid/content/Context;Ljava/lang/String;)Z", "coil-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* renamed from: r5.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16840d {
    public static final AbstractC6165l c(Context context) {
        Object baseContext = context;
        while (!(baseContext instanceof InterfaceC6172s)) {
            if (!(baseContext instanceof ContextWrapper)) {
                return null;
            }
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
        }
        return ((InterfaceC6172s) baseContext).getLifecycle();
    }

    public static final Drawable a(Context context, int i10) {
        Drawable drawableB = C14879a.b(context, i10);
        if (drawableB != null) {
            return drawableB;
        }
        throw new IllegalStateException(("Invalid resource ID: " + i10).toString());
    }

    public static final Drawable b(Resources resources, int i10, Resources.Theme theme) throws Resources.NotFoundException {
        Drawable drawableF = C6327h.f(resources, i10, theme);
        if (drawableF != null) {
            return drawableF;
        }
        throw new IllegalStateException(("Invalid resource ID: " + i10).toString());
    }

    public static final Drawable d(Context context, Resources resources, int i10) throws XmlPullParserException, Resources.NotFoundException, IOException {
        XmlResourceParser xml = resources.getXml(i10);
        int next = xml.next();
        while (next != 2 && next != 1) {
            next = xml.next();
        }
        if (next == 2) {
            return b(resources, i10, context.getTheme());
        }
        throw new XmlPullParserException("No start tag found.");
    }

    public static final boolean e(Context context, String str) {
        if (Z1.b.a(context, str) == 0) {
            return true;
        }
        return false;
    }
}
