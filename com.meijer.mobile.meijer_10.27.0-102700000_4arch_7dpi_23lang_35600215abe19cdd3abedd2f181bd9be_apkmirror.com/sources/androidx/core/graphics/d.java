package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import b2.C6184e;
import com.fullstory.FS;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.io.IOException;
import java.util.List;
import k2.g;

/* loaded from: classes.dex */
public class d extends e {
    private static FontFamily j(CancellationSignal cancellationSignal, g.b[] bVarArr, ContentResolver contentResolver) throws IOException {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        FontFamily.Builder builder = null;
        for (g.b bVar : bVarArr) {
            try {
                parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(bVar.d(), "r", cancellationSignal);
            } catch (IOException e10) {
                FS.log_w("TypefaceCompatApi29Impl", "Font load failed", e10);
            }
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                }
            } else {
                try {
                    Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(bVar.e()).setSlant(bVar.f() ? 1 : 0).setTtcIndex(bVar.c()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (Throwable th2) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            parcelFileDescriptorOpenFileDescriptor.close();
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    @Override // androidx.core.graphics.e
    public Typeface a(Context context, C6184e.c cVar, Resources resources, int i10) throws IOException {
        try {
            FontFamily.Builder builder = null;
            for (C6184e.d dVar : cVar.a()) {
                try {
                    Font fontBuild = new Font.Builder(resources, dVar.b()).setWeight(dVar.e()).setSlant(dVar.f() ? 1 : 0).setTtcIndex(dVar.c()).setFontVariationSettings(dVar.d()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(i(fontFamilyBuild, i10).getStyle()).build();
        } catch (Exception e10) {
            FS.log_w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    private Font i(FontFamily fontFamily, int i10) {
        FontStyle fontStyle = new FontStyle((i10 & 1) != 0 ? 700 : HttpResponseStatus.ERROR_BAD_REQUEST, (i10 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iK = k(fontStyle, font.getStyle());
        for (int i11 = 1; i11 < fontFamily.getSize(); i11++) {
            Font font2 = fontFamily.getFont(i11);
            int iK2 = k(fontStyle, font2.getStyle());
            if (iK2 < iK) {
                font = font2;
                iK = iK2;
            }
        }
        return font;
    }

    @Override // androidx.core.graphics.e
    public Typeface e(Context context, Resources resources, int i10, String str, int i11) throws IOException {
        try {
            Font fontBuild = new Font.Builder(resources, i10).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e10) {
            FS.log_w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // androidx.core.graphics.e
    protected g.b h(g.b[] bVarArr, int i10) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    private static int k(FontStyle fontStyle, FontStyle fontStyle2) {
        int i10;
        int iAbs = Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100;
        if (fontStyle.getSlant() == fontStyle2.getSlant()) {
            i10 = 0;
        } else {
            i10 = 2;
        }
        return iAbs + i10;
    }

    @Override // androidx.core.graphics.e
    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i10) {
        try {
            FontFamily fontFamilyJ = j(cancellationSignal, bVarArr, context.getContentResolver());
            if (fontFamilyJ == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyJ).setStyle(i(fontFamilyJ, i10).getStyle()).build();
        } catch (Exception e10) {
            FS.log_w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // androidx.core.graphics.e
    public Typeface c(Context context, CancellationSignal cancellationSignal, List<g.b[]> list, int i10) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyJ = j(cancellationSignal, list.get(0), contentResolver);
            if (fontFamilyJ == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyJ);
            for (int i11 = 1; i11 < list.size(); i11++) {
                FontFamily fontFamilyJ2 = j(cancellationSignal, list.get(i11), contentResolver);
                if (fontFamilyJ2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyJ2);
                }
            }
            return customFallbackBuilder.setStyle(i(fontFamilyJ, i10).getStyle()).build();
        } catch (Exception e10) {
            FS.log_w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }
}
