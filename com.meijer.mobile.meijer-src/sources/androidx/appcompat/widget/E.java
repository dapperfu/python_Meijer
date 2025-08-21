package androidx.appcompat.widget;

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
import b2.C6327h;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
class E extends Resources {

    /* renamed from: a, reason: collision with root package name */
    private final Resources f46862a;

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int i10, int i11) throws Resources.NotFoundException {
        return C6327h.g(this.f46862a, i10, i11, null);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i10, int i11, Object... objArr) throws Resources.NotFoundException {
        return this.f46862a.getQuantityString(i10, i11, objArr);
    }

    @Override // android.content.res.Resources
    public String getString(int i10) throws Resources.NotFoundException {
        return this.f46862a.getString(i10);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i10) throws Resources.NotFoundException {
        return this.f46862a.getText(i10);
    }

    @Override // android.content.res.Resources
    public void getValue(int i10, TypedValue typedValue, boolean z10) throws Resources.NotFoundException {
        this.f46862a.getValue(i10, typedValue, z10);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i10) throws Resources.NotFoundException {
        return this.f46862a.openRawResource(i10);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getAnimation(int i10) throws Resources.NotFoundException {
        return this.f46862a.getAnimation(i10);
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int i10) throws Resources.NotFoundException {
        return this.f46862a.getBoolean(i10);
    }

    @Override // android.content.res.Resources
    public int getColor(int i10) throws Resources.NotFoundException {
        return this.f46862a.getColor(i10);
    }

    @Override // android.content.res.Resources
    public ColorStateList getColorStateList(int i10) throws Resources.NotFoundException {
        return this.f46862a.getColorStateList(i10);
    }

    @Override // android.content.res.Resources
    public Configuration getConfiguration() {
        return this.f46862a.getConfiguration();
    }

    @Override // android.content.res.Resources
    public float getDimension(int i10) throws Resources.NotFoundException {
        return this.f46862a.getDimension(i10);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int i10) throws Resources.NotFoundException {
        return this.f46862a.getDimensionPixelOffset(i10);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int i10) throws Resources.NotFoundException {
        return this.f46862a.getDimensionPixelSize(i10);
    }

    @Override // android.content.res.Resources
    public DisplayMetrics getDisplayMetrics() {
        return this.f46862a.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i10, Resources.Theme theme) throws Resources.NotFoundException {
        return C6327h.f(this.f46862a, i10, theme);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int i10, int i11, Resources.Theme theme) {
        return C6327h.g(this.f46862a, i10, i11, theme);
    }

    @Override // android.content.res.Resources
    public float getFraction(int i10, int i11, int i12) {
        return this.f46862a.getFraction(i10, i11, i12);
    }

    @Override // android.content.res.Resources
    public int getIdentifier(String str, String str2, String str3) {
        return this.f46862a.getIdentifier(str, str2, str3);
    }

    @Override // android.content.res.Resources
    public int[] getIntArray(int i10) throws Resources.NotFoundException {
        return this.f46862a.getIntArray(i10);
    }

    @Override // android.content.res.Resources
    public int getInteger(int i10) throws Resources.NotFoundException {
        return this.f46862a.getInteger(i10);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getLayout(int i10) throws Resources.NotFoundException {
        return this.f46862a.getLayout(i10);
    }

    @Override // android.content.res.Resources
    public Movie getMovie(int i10) throws Resources.NotFoundException {
        return this.f46862a.getMovie(i10);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i10, int i11) throws Resources.NotFoundException {
        return this.f46862a.getQuantityString(i10, i11);
    }

    @Override // android.content.res.Resources
    public CharSequence getQuantityText(int i10, int i11) throws Resources.NotFoundException {
        return this.f46862a.getQuantityText(i10, i11);
    }

    @Override // android.content.res.Resources
    public String getResourceEntryName(int i10) throws Resources.NotFoundException {
        return this.f46862a.getResourceEntryName(i10);
    }

    @Override // android.content.res.Resources
    public String getResourceName(int i10) throws Resources.NotFoundException {
        return this.f46862a.getResourceName(i10);
    }

    @Override // android.content.res.Resources
    public String getResourcePackageName(int i10) throws Resources.NotFoundException {
        return this.f46862a.getResourcePackageName(i10);
    }

    @Override // android.content.res.Resources
    public String getResourceTypeName(int i10) throws Resources.NotFoundException {
        return this.f46862a.getResourceTypeName(i10);
    }

    @Override // android.content.res.Resources
    public String getString(int i10, Object... objArr) throws Resources.NotFoundException {
        return this.f46862a.getString(i10, objArr);
    }

    @Override // android.content.res.Resources
    public String[] getStringArray(int i10) throws Resources.NotFoundException {
        return this.f46862a.getStringArray(i10);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i10, CharSequence charSequence) {
        return this.f46862a.getText(i10, charSequence);
    }

    @Override // android.content.res.Resources
    public CharSequence[] getTextArray(int i10) throws Resources.NotFoundException {
        return this.f46862a.getTextArray(i10);
    }

    @Override // android.content.res.Resources
    public void getValue(String str, TypedValue typedValue, boolean z10) throws Resources.NotFoundException {
        this.f46862a.getValue(str, typedValue, z10);
    }

    @Override // android.content.res.Resources
    public void getValueForDensity(int i10, int i11, TypedValue typedValue, boolean z10) throws Resources.NotFoundException {
        this.f46862a.getValueForDensity(i10, i11, typedValue, z10);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getXml(int i10) throws Resources.NotFoundException {
        return this.f46862a.getXml(i10);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.f46862a.obtainAttributes(attributeSet, iArr);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainTypedArray(int i10) throws Resources.NotFoundException {
        return this.f46862a.obtainTypedArray(i10);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i10, TypedValue typedValue) throws Resources.NotFoundException {
        return this.f46862a.openRawResource(i10, typedValue);
    }

    @Override // android.content.res.Resources
    public AssetFileDescriptor openRawResourceFd(int i10) throws Resources.NotFoundException {
        return this.f46862a.openRawResourceFd(i10);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) throws XmlPullParserException {
        this.f46862a.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) throws XmlPullParserException, IOException {
        this.f46862a.parseBundleExtras(xmlResourceParser, bundle);
    }

    public E(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f46862a = resources;
    }

    final Drawable a(int i10) throws Resources.NotFoundException {
        return super.getDrawable(i10);
    }

    @Override // android.content.res.Resources
    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.f46862a;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }
}
