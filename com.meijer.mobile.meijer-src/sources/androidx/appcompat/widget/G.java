package androidx.appcompat.widget;

import android.R;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.fullstory.FS;
import com.medallia.digital.mobilesdk.q2;
import i.C14578a;
import i.C14583f;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
class G extends u2.c implements View.OnClickListener {

    /* renamed from: l, reason: collision with root package name */
    private final SearchView f46873l;

    /* renamed from: m, reason: collision with root package name */
    private final SearchableInfo f46874m;

    /* renamed from: n, reason: collision with root package name */
    private final Context f46875n;

    /* renamed from: o, reason: collision with root package name */
    private final WeakHashMap<String, Drawable.ConstantState> f46876o;

    /* renamed from: p, reason: collision with root package name */
    private final int f46877p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f46878q;

    /* renamed from: r, reason: collision with root package name */
    private int f46879r;

    /* renamed from: s, reason: collision with root package name */
    private ColorStateList f46880s;

    /* renamed from: t, reason: collision with root package name */
    private int f46881t;

    /* renamed from: u, reason: collision with root package name */
    private int f46882u;

    /* renamed from: v, reason: collision with root package name */
    private int f46883v;

    /* renamed from: w, reason: collision with root package name */
    private int f46884w;

    /* renamed from: x, reason: collision with root package name */
    private int f46885x;

    /* renamed from: y, reason: collision with root package name */
    private int f46886y;

    private Drawable r(String str) throws NumberFormatException, IOException {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int i10 = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f46875n.getPackageName() + q2.f93563c + i10;
            Drawable drawableJ = j(str2);
            if (drawableJ != null) {
                return drawableJ;
            }
            Drawable drawableE = Z1.b.e(this.f46875n, i10);
            A(str2, drawableE);
            return drawableE;
        } catch (Resources.NotFoundException unused) {
            FS.log_w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable drawableJ2 = j(str);
            if (drawableJ2 != null) {
                return drawableJ2;
            }
            Drawable drawableP = p(Uri.parse(str));
            A(str, drawableP);
            return drawableP;
        }
    }

    private static String w(Cursor cursor, int i10) {
        if (i10 == -1) {
            return null;
        }
        try {
            return cursor.getString(i10);
        } catch (Exception e10) {
            FS.log_e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e10);
            return null;
        }
    }

    @Override // u2.b.a
    public CharSequence convertToString(Cursor cursor) {
        String strN;
        String strN2;
        if (cursor == null) {
            return null;
        }
        String strN3 = n(cursor, "suggest_intent_query");
        if (strN3 != null) {
            return strN3;
        }
        if (this.f46874m.shouldRewriteQueryFromData() && (strN2 = n(cursor, "suggest_intent_data")) != null) {
            return strN2;
        }
        if (!this.f46874m.shouldRewriteQueryFromText() || (strN = n(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return strN;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    Cursor v(SearchableInfo searchableInfo, String str, int i10) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i10 > 0) {
            builderFragment.appendQueryParameter("limit", String.valueOf(i10));
        }
        return this.f46875n.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final TextView f46887a;

        /* renamed from: b, reason: collision with root package name */
        public final TextView f46888b;

        /* renamed from: c, reason: collision with root package name */
        public final ImageView f46889c;

        /* renamed from: d, reason: collision with root package name */
        public final ImageView f46890d;

        /* renamed from: e, reason: collision with root package name */
        public final ImageView f46891e;

        public a(View view) {
            this.f46887a = (TextView) view.findViewById(R.id.text1);
            this.f46888b = (TextView) view.findViewById(R.id.text2);
            this.f46889c = (ImageView) view.findViewById(R.id.icon1);
            this.f46890d = (ImageView) view.findViewById(R.id.icon2);
            this.f46891e = (ImageView) view.findViewById(C14583f.f136395q);
        }
    }

    private void A(String str, Drawable drawable) {
        if (drawable != null) {
            this.f46876o.put(str, drawable.getConstantState());
        }
    }

    private void B(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    private Drawable j(String str) {
        Drawable.ConstantState constantState = this.f46876o.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private CharSequence k(CharSequence charSequence) {
        if (this.f46880s == null) {
            TypedValue typedValue = new TypedValue();
            this.f46875n.getTheme().resolveAttribute(C14578a.f136276P, typedValue, true);
            this.f46880s = this.f46875n.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f46880s, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    private Drawable l(ComponentName componentName) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = this.f46875n.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            FS.log_w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            FS.log_w("SuggestionsAdapter", e10.toString());
            return null;
        }
    }

    private Drawable o() throws PackageManager.NameNotFoundException {
        Drawable drawableM = m(this.f46874m.getSearchActivity());
        return drawableM != null ? drawableM : this.f46875n.getPackageManager().getDefaultActivityIcon();
    }

    private Drawable p(Uri uri) throws IOException {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return q(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream inputStreamOpenInputStream = this.f46875n.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamOpenInputStream, null);
                try {
                    return drawableCreateFromStream;
                } catch (IOException e10) {
                    return drawableCreateFromStream;
                }
            } finally {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException e102) {
                    FS.log_e("SuggestionsAdapter", "Error closing icon stream for " + uri, e102);
                }
            }
        } catch (FileNotFoundException e11) {
            FS.log_w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e11.getMessage());
            return null;
        }
        FS.log_w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e11.getMessage());
        return null;
    }

    private Drawable t(Cursor cursor) throws NumberFormatException, IOException {
        int i10 = this.f46884w;
        if (i10 == -1) {
            return null;
        }
        Drawable drawableR = r(cursor.getString(i10));
        return drawableR != null ? drawableR : o();
    }

    private Drawable u(Cursor cursor) {
        int i10 = this.f46885x;
        if (i10 == -1) {
            return null;
        }
        return r(cursor.getString(i10));
    }

    @Override // u2.AbstractC17346a, u2.b.a
    public void a(Cursor cursor) {
        if (this.f46878q) {
            FS.log_w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.a(cursor);
            if (cursor != null) {
                this.f46881t = cursor.getColumnIndex("suggest_text_1");
                this.f46882u = cursor.getColumnIndex("suggest_text_2");
                this.f46883v = cursor.getColumnIndex("suggest_text_2_url");
                this.f46884w = cursor.getColumnIndex("suggest_icon_1");
                this.f46885x = cursor.getColumnIndex("suggest_icon_2");
                this.f46886y = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e10) {
            FS.log_e("SuggestionsAdapter", "error changing cursor and caching columns", e10);
        }
    }

    @Override // u2.b.a
    public Cursor b(CharSequence charSequence) {
        String string = charSequence == null ? "" : charSequence.toString();
        if (this.f46873l.getVisibility() == 0 && this.f46873l.getWindowVisibility() == 0) {
            try {
                Cursor cursorV = v(this.f46874m, string, 50);
                if (cursorV != null) {
                    cursorV.getCount();
                    return cursorV;
                }
            } catch (RuntimeException e10) {
                FS.log_w("SuggestionsAdapter", "Search suggestions query threw an exception.", e10);
            }
        }
        return null;
    }

    public void x(int i10) {
        this.f46879r = i10;
    }

    public G(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f46878q = false;
        this.f46879r = 1;
        this.f46881t = -1;
        this.f46882u = -1;
        this.f46883v = -1;
        this.f46884w = -1;
        this.f46885x = -1;
        this.f46886y = -1;
        this.f46873l = searchView;
        this.f46874m = searchableInfo;
        this.f46877p = searchView.getSuggestionCommitIconResId();
        this.f46875n = context;
        this.f46876o = weakHashMap;
    }

    private Drawable m(ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strFlattenToShortString = componentName.flattenToShortString();
        Drawable.ConstantState constantState = null;
        if (this.f46876o.containsKey(strFlattenToShortString)) {
            Drawable.ConstantState constantState2 = this.f46876o.get(strFlattenToShortString);
            if (constantState2 == null) {
                return null;
            }
            return constantState2.newDrawable(this.f46875n.getResources());
        }
        Drawable drawableL = l(componentName);
        if (drawableL != null) {
            constantState = drawableL.getConstantState();
        }
        this.f46876o.put(strFlattenToShortString, constantState);
        return drawableL;
    }

    public static String n(Cursor cursor, String str) {
        return w(cursor, cursor.getColumnIndex(str));
    }

    private void y(ImageView imageView, Drawable drawable, int i10) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i10);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    private void z(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    @Override // u2.AbstractC17346a
    public void d(View view, Context context, Cursor cursor) {
        int i10;
        CharSequence charSequenceW;
        a aVar = (a) view.getTag();
        int i11 = this.f46886y;
        if (i11 != -1) {
            i10 = cursor.getInt(i11);
        } else {
            i10 = 0;
        }
        if (aVar.f46887a != null) {
            z(aVar.f46887a, w(cursor, this.f46881t));
        }
        if (aVar.f46888b != null) {
            String strW = w(cursor, this.f46883v);
            if (strW != null) {
                charSequenceW = k(strW);
            } else {
                charSequenceW = w(cursor, this.f46882u);
            }
            if (TextUtils.isEmpty(charSequenceW)) {
                TextView textView = aVar.f46887a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f46887a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f46887a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f46887a.setMaxLines(1);
                }
            }
            z(aVar.f46888b, charSequenceW);
        }
        ImageView imageView = aVar.f46889c;
        if (imageView != null) {
            y(imageView, t(cursor), 4);
        }
        ImageView imageView2 = aVar.f46890d;
        if (imageView2 != null) {
            y(imageView2, u(cursor), 8);
        }
        int i12 = this.f46879r;
        if (i12 != 2 && (i12 != 1 || (i10 & 1) == 0)) {
            aVar.f46891e.setVisibility(8);
            return;
        }
        aVar.f46891e.setVisibility(0);
        aVar.f46891e.setTag(aVar.f46887a.getText());
        aVar.f46891e.setOnClickListener(this);
    }

    @Override // u2.c, u2.AbstractC17346a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        View viewG = super.g(context, cursor, viewGroup);
        viewG.setTag(new a(viewG));
        FS.Resources_setImageResource((ImageView) viewG.findViewById(C14583f.f136395q), this.f46877p);
        return viewG;
    }

    @Override // u2.AbstractC17346a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            FS.log_w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View viewF = f(this.f46875n, c(), viewGroup);
            if (viewF != null) {
                ((a) viewF.getTag()).f46887a.setText(e10.toString());
            }
            return viewF;
        }
    }

    @Override // u2.AbstractC17346a, android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            FS.log_w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View viewG = g(this.f46875n, c(), viewGroup);
            if (viewG != null) {
                ((a) viewG.getTag()).f46887a.setText(e10.toString());
            }
            return viewG;
        }
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        B(c());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        B(c());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f46873l.K((CharSequence) tag);
        }
    }

    Drawable q(Uri uri) throws PackageManager.NameNotFoundException, NumberFormatException, FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f46875n.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            identifier = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (identifier != 0) {
                        return FS.Resources_getDrawable(resourcesForApplication, identifier);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        }
        throw new FileNotFoundException("No authority: " + uri);
    }
}
