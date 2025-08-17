package com.medallia.digital.mobilesdk;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.text.TextUtils;
import com.medallia.digital.mobilesdk.j2;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
class k2 extends h1<j2> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f92398a = "formData";

    class a extends HashMap<String, String> {
        a() {
            put("formId", "TEXT");
            put("name", "TEXT");
            put("fromJson", "TEXT");
            put("templatePath", "TEXT");
            put("templateId", "TEXT");
            put("title", "TEXT");
            put("titleTextColor", "TEXT");
            put("titleBackgroundColor", "TEXT");
            put("formType", "TEXT");
            put("formStatus", "INTEGER");
            put("transitionType", "TEXT");
            put("inviteData", "TEXT");
            put("viewType", "TEXT");
            put("isPreloaded", "INTEGER");
            put("formLanguage", "TEXT");
            put("isRtl", "INTEGER");
            put("poweredBy", "INTEGER");
            put("thankYouData", "TEXT");
            put("isBlockNetworkInForm", "INTEGER");
            put("redirectLinks", "TEXT");
            put("templateDebugRemoteUrl", "TEXT");
            put("urlVersion", "TEXT");
            put("shouldDownloadDebugForm", "INTEGER");
            put("headerThemeName", "TEXT");
            put("isDarkModeEnabled", "INTEGER");
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final String f92400a = "formId";

        /* renamed from: b, reason: collision with root package name */
        private static final String f92401b = "name";

        /* renamed from: c, reason: collision with root package name */
        private static final String f92402c = "fromJson";

        /* renamed from: d, reason: collision with root package name */
        private static final String f92403d = "templatePath";

        /* renamed from: e, reason: collision with root package name */
        private static final String f92404e = "templateId";

        /* renamed from: f, reason: collision with root package name */
        private static final String f92405f = "title";

        /* renamed from: g, reason: collision with root package name */
        private static final String f92406g = "titleTextColor";

        /* renamed from: h, reason: collision with root package name */
        private static final String f92407h = "titleBackgroundColor";

        /* renamed from: i, reason: collision with root package name */
        private static final String f92408i = "formType";

        /* renamed from: j, reason: collision with root package name */
        private static final String f92409j = "formStatus";

        /* renamed from: k, reason: collision with root package name */
        private static final String f92410k = "transitionType";

        /* renamed from: l, reason: collision with root package name */
        private static final String f92411l = "inviteData";

        /* renamed from: m, reason: collision with root package name */
        private static final String f92412m = "viewType";

        /* renamed from: n, reason: collision with root package name */
        private static final String f92413n = "isPreloaded";

        /* renamed from: o, reason: collision with root package name */
        private static final String f92414o = "formLanguage";

        /* renamed from: p, reason: collision with root package name */
        private static final String f92415p = "isRtl";

        /* renamed from: q, reason: collision with root package name */
        private static final String f92416q = "poweredBy";

        /* renamed from: r, reason: collision with root package name */
        private static final String f92417r = "thankYouData";

        /* renamed from: s, reason: collision with root package name */
        private static final String f92418s = "redirectLinks";

        /* renamed from: t, reason: collision with root package name */
        private static final String f92419t = "isBlockNetworkInForm";

        /* renamed from: u, reason: collision with root package name */
        private static final String f92420u = "templateDebugRemoteUrl";

        /* renamed from: v, reason: collision with root package name */
        private static final String f92421v = "urlVersion";

        /* renamed from: w, reason: collision with root package name */
        private static final String f92422w = "shouldDownloadDebugForm";

        /* renamed from: x, reason: collision with root package name */
        private static final String f92423x = "headerThemeName";

        /* renamed from: y, reason: collision with root package name */
        private static final String f92424y = "isDarkModeEnabled";

        private b() {
        }
    }

    k2() {
    }

    private InviteData a(Cursor cursor) {
        String string = cursor.getString(cursor.getColumnIndex("inviteData"));
        try {
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            return new InviteData(new JSONObject(string));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return null;
        }
    }

    private r7 c(Cursor cursor) {
        String string = cursor.getString(cursor.getColumnIndex("thankYouData"));
        try {
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            return new r7(new JSONObject(string));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return null;
        }
    }

    @Override // com.medallia.digital.mobilesdk.h1
    protected long b() {
        try {
            return DatabaseUtils.queryNumEntries(f1.a().getWritableDatabase(), f92398a);
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.h1
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public j2 b(Object... objArr) {
        Object obj;
        Cursor cursorQuery;
        j2 j2Var = null;
        if (objArr != null && objArr.length > 0 && (obj = objArr[0]) != null && (obj instanceof String) && (cursorQuery = f1.a().getReadableDatabase().query(d(), null, "formId=?", new String[]{(String) obj}, null, null, null)) != null) {
            if (cursorQuery.moveToFirst()) {
                j2Var = new j2(cursorQuery.getString(cursorQuery.getColumnIndex("formId")), cursorQuery.getString(cursorQuery.getColumnIndex("name")), cursorQuery.getString(cursorQuery.getColumnIndex("fromJson")), cursorQuery.getString(cursorQuery.getColumnIndex("templatePath")), cursorQuery.getString(cursorQuery.getColumnIndex("templateId")), new l6().a(cursorQuery.getString(cursorQuery.getColumnIndex("formId"))), cursorQuery.getString(cursorQuery.getColumnIndex("title")), cursorQuery.getString(cursorQuery.getColumnIndex("titleTextColor")), cursorQuery.getString(cursorQuery.getColumnIndex("titleBackgroundColor")), FormTriggerType.fromString(cursorQuery.getString(cursorQuery.getColumnIndex("formType"))), j2.a.a(cursorQuery.getInt(cursorQuery.getColumnIndex("formStatus"))), c8.a(cursorQuery.getString(cursorQuery.getColumnIndex("transitionType"))), a(cursorQuery), FormViewType.fromString(cursorQuery.getString(cursorQuery.getColumnIndex("viewType"))), cursorQuery.getInt(cursorQuery.getColumnIndex("isPreloaded")) == 1, cursorQuery.getString(cursorQuery.getColumnIndex("formLanguage")), cursorQuery.getInt(cursorQuery.getColumnIndex("isRtl")) == 1, cursorQuery.getInt(cursorQuery.getColumnIndex("poweredBy")) == 1, c(cursorQuery), cursorQuery.getInt(cursorQuery.getColumnIndex("isBlockNetworkInForm")) == 1, b(cursorQuery), cursorQuery.getString(cursorQuery.getColumnIndex("templateDebugRemoteUrl")), cursorQuery.getString(cursorQuery.getColumnIndex("urlVersion")), cursorQuery.getInt(cursorQuery.getColumnIndex("shouldDownloadDebugForm")) == 1, cursorQuery.getString(cursorQuery.getColumnIndex("headerThemeName")), cursorQuery.getInt(cursorQuery.getColumnIndex("isDarkModeEnabled")) == 1);
            }
            cursorQuery.close();
        }
        return j2Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.h1
    public boolean a(j2 j2Var) {
        StringBuilder sb2;
        boolean z10 = true;
        if (j2Var == null || TextUtils.isEmpty(j2Var.getFormId())) {
            sb2 = new StringBuilder();
            sb2.append("delete (invalid data) - ");
            sb2.append(j2Var == null ? "record is null" : "formId is not valid");
        } else {
            z = f1.a().getWritableDatabase().delete(d(), "formId=?", new String[]{j2Var.getFormId()}) > 0;
            z10 = !z;
            sb2 = new StringBuilder();
            sb2.append("delete - ");
            sb2.append(j2Var);
        }
        a(z10, sb2.toString());
        return z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.h1
    public ContentValues b(j2 j2Var) {
        ContentValues contentValues = new ContentValues();
        if (j2Var != null) {
            contentValues.put("formId", j2Var.getFormId());
            contentValues.put("name", j2Var.b());
            contentValues.put("fromJson", j2Var.a());
            contentValues.put("templatePath", j2Var.g());
            contentValues.put("templateId", j2Var.h());
            contentValues.put("title", j2Var.getTitle());
            contentValues.put("titleTextColor", j2Var.getTitleTextColor());
            contentValues.put("titleBackgroundColor", j2Var.getTitleBackgroundColor());
            contentValues.put("formType", j2Var.getFormType() != null ? j2Var.getFormType().toString() : null);
            contentValues.put("formStatus", j2Var.c() != null ? Integer.valueOf(j2Var.c().a()) : null);
            contentValues.put("transitionType", j2Var.j() != null ? j2Var.j().a() : null);
            contentValues.put("inviteData", j2Var.getInviteData() != null ? j2Var.getInviteData().toJsonString() : null);
            contentValues.put("viewType", j2Var.getFormViewType() != null ? j2Var.getFormViewType().toString() : null);
            contentValues.put("isPreloaded", Integer.valueOf(j2Var.l() ? 1 : 0));
            contentValues.put("formLanguage", j2Var.getFormLanguage());
            contentValues.put("isRtl", Integer.valueOf(j2Var.isRtl() ? 1 : 0));
            contentValues.put("poweredBy", Integer.valueOf(j2Var.isPoweredByVisible() ? 1 : 0));
            contentValues.put("thankYouData", j2Var.i() != null ? j2Var.i().t() : null);
            contentValues.put("isBlockNetworkInForm", Integer.valueOf(j2Var.k() ? 1 : 0));
            contentValues.put("redirectLinks", j2Var.e() != null ? ModelFactory.getInstance().getStringArrayAsJsonString(j2Var.e()) : null);
            contentValues.put("templateDebugRemoteUrl", j2Var.getTemplateDebugRemoteUrl());
            contentValues.put("urlVersion", j2Var.getUrlVersion());
            contentValues.put("shouldDownloadDebugForm", Integer.valueOf(j2Var.n() ? 1 : 0));
            contentValues.put("headerThemeName", j2Var.getHeaderThemeName());
            contentValues.put("isDarkModeEnabled", Integer.valueOf(j2Var.isDarkModeEnabled() ? 1 : 0));
        }
        return contentValues;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    protected ArrayList<j2> c(Object... objArr) {
        ArrayList<j2> arrayList = new ArrayList<>();
        Cursor cursorQuery = f1.a().getReadableDatabase().query(d(), null, null, null, null, null, null);
        if (cursorQuery != null) {
            if (cursorQuery.moveToFirst()) {
                do {
                    arrayList.add(new j2(cursorQuery.getString(cursorQuery.getColumnIndex("formId")), cursorQuery.getString(cursorQuery.getColumnIndex("name")), cursorQuery.getString(cursorQuery.getColumnIndex("fromJson")), cursorQuery.getString(cursorQuery.getColumnIndex("templatePath")), cursorQuery.getString(cursorQuery.getColumnIndex("templateId")), new l6().a(cursorQuery.getString(cursorQuery.getColumnIndex("formId"))), cursorQuery.getString(cursorQuery.getColumnIndex("title")), cursorQuery.getString(cursorQuery.getColumnIndex("titleTextColor")), cursorQuery.getString(cursorQuery.getColumnIndex("titleBackgroundColor")), FormTriggerType.fromString(cursorQuery.getString(cursorQuery.getColumnIndex("formType"))), j2.a.a(cursorQuery.getInt(cursorQuery.getColumnIndex("formStatus"))), c8.a(cursorQuery.getString(cursorQuery.getColumnIndex("transitionType"))), a(cursorQuery), FormViewType.fromString(cursorQuery.getString(cursorQuery.getColumnIndex("viewType"))), cursorQuery.getInt(cursorQuery.getColumnIndex("isPreloaded")) == 1, cursorQuery.getString(cursorQuery.getColumnIndex("formLanguage")), cursorQuery.getInt(cursorQuery.getColumnIndex("isRtl")) == 1, cursorQuery.getInt(cursorQuery.getColumnIndex("poweredBy")) == 1, c(cursorQuery), cursorQuery.getInt(cursorQuery.getColumnIndex("isBlockNetworkInForm")) == 1, b(cursorQuery), cursorQuery.getString(cursorQuery.getColumnIndex("templateDebugRemoteUrl")), cursorQuery.getString(cursorQuery.getColumnIndex("urlVersion")), cursorQuery.getInt(cursorQuery.getColumnIndex("shouldDownloadDebugForm")) == 1, cursorQuery.getString(cursorQuery.getColumnIndex("headerThemeName")), cursorQuery.getInt(cursorQuery.getColumnIndex("isDarkModeEnabled")) == 1));
                } while (cursorQuery.moveToNext());
            }
            cursorQuery.close();
        }
        return arrayList;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    protected String d() {
        return f92398a;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    protected HashMap<String, String> c() {
        return new a();
    }

    @Override // com.medallia.digital.mobilesdk.h1
    protected boolean a(Object... objArr) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.h1
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean d(j2 j2Var) {
        return f1.a().getWritableDatabase().update(d(), b(j2Var), "formId=?", new String[]{j2Var.getFormId()}) > 0 || super.c((k2) j2Var);
    }

    private ArrayList<String> b(Cursor cursor) {
        String string = cursor.getString(cursor.getColumnIndex("redirectLinks"));
        try {
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            return ModelFactory.getInstance().getStringArray(new JSONArray(string));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return null;
        }
    }
}
