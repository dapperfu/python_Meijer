package R6;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006JO\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0010\u0010\u000b\u001a\f\u0012\u0006\b\u0001\u0012\u00020\n\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\n2\u0010\u0010\r\u001a\f\u0012\u0006\b\u0001\u0012\u00020\n\u0018\u00010\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u0004\u0018\u00010\n2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0016\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010\u0019\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\n2\u0010\u0010\r\u001a\f\u0012\u0006\b\u0001\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u0019\u0010\u001aJ;\u0010\u001b\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\f\u001a\u0004\u0018\u00010\n2\u0010\u0010\r\u001a\f\u0012\u0006\b\u0001\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0005¢\u0006\u0004\b\u001e\u0010\u0003¨\u0006\u001f"}, d2 = {"LR6/a;", "Landroid/content/ContentProvider;", "<init>", "()V", "", "onCreate", "()Z", "Landroid/net/Uri;", "uri", "", "", "projection", "selection", "selectionArgs", "sortOrder", "Landroid/database/Cursor;", "query", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "getType", "(Landroid/net/Uri;)Ljava/lang/String;", "Landroid/content/ContentValues;", "values", "insert", "(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;", "", "delete", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "update", "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "", "a", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public abstract class a extends ContentProvider {
    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @SuppressLint({"NewApi"})
    protected final void a() {
        int i10 = Build.VERSION.SDK_INT;
        if (26 > i10 || i10 >= 29) {
            return;
        }
        String callingPackage = getCallingPackage();
        if (callingPackage != null) {
            Context context = getContext();
            if (Intrinsics.e(callingPackage, context == null ? null : context.getPackageName())) {
                return;
            }
        }
        throw new SecurityException("Provider does not allow Uri permissions to be granted");
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String selection, String[] selectionArgs) {
        a();
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        a();
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues values) {
        a();
        return null;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        a();
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        a();
        return 0;
    }
}
