package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class X extends E {

    /* renamed from: c, reason: collision with root package name */
    private static boolean f46944c;

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference<Context> f46945b;

    @Override // androidx.appcompat.widget.E, android.content.res.Resources
    public /* bridge */ /* synthetic */ Drawable getDrawable(int i10, Resources.Theme theme) throws Resources.NotFoundException {
        return super.getDrawable(i10, theme);
    }

    @Override // androidx.appcompat.widget.E, android.content.res.Resources
    public /* bridge */ /* synthetic */ Drawable getDrawableForDensity(int i10, int i11) throws Resources.NotFoundException {
        return super.getDrawableForDensity(i10, i11);
    }

    @Override // androidx.appcompat.widget.E, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getQuantityString(int i10, int i11) throws Resources.NotFoundException {
        return super.getQuantityString(i10, i11);
    }

    @Override // androidx.appcompat.widget.E, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getString(int i10) throws Resources.NotFoundException {
        return super.getString(i10);
    }

    @Override // androidx.appcompat.widget.E, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence getText(int i10) throws Resources.NotFoundException {
        return super.getText(i10);
    }

    @Override // androidx.appcompat.widget.E, android.content.res.Resources
    public /* bridge */ /* synthetic */ void getValue(int i10, TypedValue typedValue, boolean z10) throws Resources.NotFoundException {
        super.getValue(i10, typedValue, z10);
    }

    @Override // androidx.appcompat.widget.E, android.content.res.Resources
    public /* bridge */ /* synthetic */ InputStream openRawResource(int i10) throws Resources.NotFoundException {
        return super.openRawResource(i10);
    }

    public static boolean b() {
        return f46944c;
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i10) throws Resources.NotFoundException {
        Context context = this.f46945b.get();
        return context != null ? D.g().s(context, this, i10) : a(i10);
    }

    @Override // androidx.appcompat.widget.E, android.content.res.Resources
    public /* bridge */ /* synthetic */ Drawable getDrawableForDensity(int i10, int i11, Resources.Theme theme) {
        return super.getDrawableForDensity(i10, i11, theme);
    }

    @Override // androidx.appcompat.widget.E, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getQuantityString(int i10, int i11, Object[] objArr) throws Resources.NotFoundException {
        return super.getQuantityString(i10, i11, objArr);
    }

    @Override // androidx.appcompat.widget.E, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getString(int i10, Object[] objArr) throws Resources.NotFoundException {
        return super.getString(i10, objArr);
    }

    @Override // androidx.appcompat.widget.E, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence getText(int i10, CharSequence charSequence) {
        return super.getText(i10, charSequence);
    }

    @Override // androidx.appcompat.widget.E, android.content.res.Resources
    public /* bridge */ /* synthetic */ void getValue(String str, TypedValue typedValue, boolean z10) throws Resources.NotFoundException {
        super.getValue(str, typedValue, z10);
    }

    @Override // androidx.appcompat.widget.E, android.content.res.Resources
    public /* bridge */ /* synthetic */ InputStream openRawResource(int i10, TypedValue typedValue) throws Resources.NotFoundException {
        return super.openRawResource(i10, typedValue);
    }

    public X(Context context, Resources resources) {
        super(resources);
        this.f46945b = new WeakReference<>(context);
    }

    public static boolean c() {
        b();
        return false;
    }

    @Override // androidx.appcompat.widget.E, android.content.res.Resources
    public /* bridge */ /* synthetic */ XmlResourceParser getAnimation(int i10) throws Resources.NotFoundException {
        return super.getAnimation(i10);
    }

    @Override // androidx.appcompat.widget.E, android.content.res.Resources
    public /* bridge */ /* synthetic */ boolean getBoolean(int i10) throws Resources.NotFoundException {
        return super.getBoolean(i10);
    }

    @Override // androidx.appcompat.widget.E, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getColor(int i10) throws Resources.NotFoundException {
        return super.getColor(i10);
    }

    @Override // androidx.appcompat.widget.E, android.content.res.Resources
    public /* bridge */ /* synthetic */ ColorStateList getColorStateList(int i10) throws Resources.NotFoundException {
        return super.getColorStateList(i10);
    }

    @Override // androidx.appcompat.widget.E, android.content.res.Resources
    public /* bridge */ /* synthetic */ Configuration getConfiguration() {
        return super.getConfiguration();
    }

    @Override // androidx.appcompat.widget.E, android.content.res.Resources
    public /* bridge */ /* synthetic */ float getDimension(int i10) throws Resources.NotFoundException {
        return super.getDimension(i10);
    }

    @Override // androidx.appcompat.widget.E, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getDimensionPixelOffset(int i10) throws Resources.NotFoundException {
        return super.getDimensionPixelOffset(i10);
    }

    @Override // androidx.appcompat.widget.E, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getDimensionPixelSize(int i10) throws Resources.NotFoundException {
        return super.getDimensionPixelSize(i10);
    }

    @Override // androidx.appcompat.widget.E, android.content.res.Resources
    public /* bridge */ /* synthetic */ DisplayMetrics getDisplayMetrics() {
        return super.getDisplayMetrics();
    }

    @Override // androidx.appcompat.widget.E, android.content.res.Resources
    public /* bridge */ /* synthetic */ float getFraction(int i10, int i11, int i12) {
        return super.getFraction(i10, i11, i12);
    }

    @Override // androidx.appcompat.widget.E, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getIdentifier(String str, String str2, String str3) {
        return super.getIdentifier(str, str2, str3);
    }

    @Override // androidx.appcompat.widget.E, android.content.res.Resources
    public /* bridge */ /* synthetic */ int[] getIntArray(int i10) throws Resources.NotFoundException {
        return super.getIntArray(i10);
    }

    @Override // androidx.appcompat.widget.E, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getInteger(int i10) throws Resources.NotFoundException {
        return super.getInteger(i10);
    }

    @Override // androidx.appcompat.widget.E, android.content.res.Resources
    public /* bridge */ /* synthetic */ XmlResourceParser getLayout(int i10) throws Resources.NotFoundException {
        return super.getLayout(i10);
    }

    @Override // androidx.appcompat.widget.E, android.content.res.Resources
    public /* bridge */ /* synthetic */ Movie getMovie(int i10) throws Resources.NotFoundException {
        return super.getMovie(i10);
    }

    @Override // androidx.appcompat.widget.E, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence getQuantityText(int i10, int i11) throws Resources.NotFoundException {
        return super.getQuantityText(i10, i11);
    }

    @Override // androidx.appcompat.widget.E, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourceEntryName(int i10) throws Resources.NotFoundException {
        return super.getResourceEntryName(i10);
    }

    @Override // androidx.appcompat.widget.E, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourceName(int i10) throws Resources.NotFoundException {
        return super.getResourceName(i10);
    }

    @Override // androidx.appcompat.widget.E, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourcePackageName(int i10) throws Resources.NotFoundException {
        return super.getResourcePackageName(i10);
    }

    @Override // androidx.appcompat.widget.E, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourceTypeName(int i10) throws Resources.NotFoundException {
        return super.getResourceTypeName(i10);
    }

    @Override // androidx.appcompat.widget.E, android.content.res.Resources
    public /* bridge */ /* synthetic */ String[] getStringArray(int i10) throws Resources.NotFoundException {
        return super.getStringArray(i10);
    }

    @Override // androidx.appcompat.widget.E, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence[] getTextArray(int i10) throws Resources.NotFoundException {
        return super.getTextArray(i10);
    }

    @Override // androidx.appcompat.widget.E, android.content.res.Resources
    public /* bridge */ /* synthetic */ void getValueForDensity(int i10, int i11, TypedValue typedValue, boolean z10) throws Resources.NotFoundException {
        super.getValueForDensity(i10, i11, typedValue, z10);
    }

    @Override // androidx.appcompat.widget.E, android.content.res.Resources
    public /* bridge */ /* synthetic */ XmlResourceParser getXml(int i10) throws Resources.NotFoundException {
        return super.getXml(i10);
    }

    @Override // androidx.appcompat.widget.E, android.content.res.Resources
    public /* bridge */ /* synthetic */ TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return super.obtainAttributes(attributeSet, iArr);
    }

    @Override // androidx.appcompat.widget.E, android.content.res.Resources
    public /* bridge */ /* synthetic */ TypedArray obtainTypedArray(int i10) throws Resources.NotFoundException {
        return super.obtainTypedArray(i10);
    }

    @Override // androidx.appcompat.widget.E, android.content.res.Resources
    public /* bridge */ /* synthetic */ AssetFileDescriptor openRawResourceFd(int i10) throws Resources.NotFoundException {
        return super.openRawResourceFd(i10);
    }

    @Override // androidx.appcompat.widget.E, android.content.res.Resources
    public /* bridge */ /* synthetic */ void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) throws XmlPullParserException {
        super.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // androidx.appcompat.widget.E, android.content.res.Resources
    public /* bridge */ /* synthetic */ void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) throws XmlPullParserException, IOException {
        super.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // androidx.appcompat.widget.E, android.content.res.Resources
    public /* bridge */ /* synthetic */ void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
    }
}
