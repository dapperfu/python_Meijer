package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.f;
import com.google.android.gms.common.util.i;
import io.constructor.data.local.PreferencesHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import md.AbstractC15707a;
import md.C15708b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes4.dex */
public class GoogleSignInAccount extends AbstractC15707a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new a();

    /* renamed from: n, reason: collision with root package name */
    public static final f f65522n = i.d();

    /* renamed from: a, reason: collision with root package name */
    final int f65523a;

    /* renamed from: b, reason: collision with root package name */
    private final String f65524b;

    /* renamed from: c, reason: collision with root package name */
    private final String f65525c;

    /* renamed from: d, reason: collision with root package name */
    private final String f65526d;

    /* renamed from: e, reason: collision with root package name */
    private final String f65527e;

    /* renamed from: f, reason: collision with root package name */
    private final Uri f65528f;

    /* renamed from: g, reason: collision with root package name */
    private String f65529g;

    /* renamed from: h, reason: collision with root package name */
    private final long f65530h;

    /* renamed from: i, reason: collision with root package name */
    private final String f65531i;

    /* renamed from: j, reason: collision with root package name */
    final List f65532j;

    /* renamed from: k, reason: collision with root package name */
    private final String f65533k;

    /* renamed from: l, reason: collision with root package name */
    private final String f65534l;

    /* renamed from: m, reason: collision with root package name */
    private final Set f65535m = new HashSet();

    public String I0() {
        return this.f65533k;
    }

    public String T() {
        return this.f65527e;
    }

    public String U0() {
        return this.f65524b;
    }

    public String b0() {
        return this.f65526d;
    }

    public String d1() {
        return this.f65525c;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f65531i.equals(this.f65531i) && googleSignInAccount.j1().equals(j1());
    }

    public Uri h1() {
        return this.f65528f;
    }

    public String r0() {
        return this.f65534l;
    }

    public String y1() {
        return this.f65529g;
    }

    public static GoogleSignInAccount P1(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l10, String str7, Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l10.longValue(), r.f(str7), new ArrayList((Collection) r.l(set)), str5, str6);
    }

    public Account B() {
        String str = this.f65526d;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    public int hashCode() {
        return ((this.f65531i.hashCode() + 527) * 31) + j1().hashCode();
    }

    public Set<Scope> j1() {
        HashSet hashSet = new HashSet(this.f65532j);
        hashSet.addAll(this.f65535m);
        return hashSet;
    }

    GoogleSignInAccount(int i10, String str, String str2, String str3, String str4, Uri uri, String str5, long j10, String str6, List list, String str7, String str8) {
        this.f65523a = i10;
        this.f65524b = str;
        this.f65525c = str2;
        this.f65526d = str3;
        this.f65527e = str4;
        this.f65528f = uri;
        this.f65529g = str5;
        this.f65530h = j10;
        this.f65531i = str6;
        this.f65532j = list;
        this.f65533k = str7;
        this.f65534l = str8;
    }

    public static GoogleSignInAccount a2(String str) throws JSONException, NumberFormatException {
        Uri uri;
        String strOptString;
        String strOptString2;
        String strOptString3;
        String strOptString4;
        String strOptString5;
        String strOptString6 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString7 = jSONObject.optString("photoUrl");
        if (!TextUtils.isEmpty(strOptString7)) {
            uri = Uri.parse(strOptString7);
        } else {
            uri = null;
        }
        long j10 = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(jSONArray.getString(i10)));
        }
        String strOptString8 = jSONObject.optString(PreferencesHelper.PREF_ID);
        if (jSONObject.has("tokenId")) {
            strOptString = jSONObject.optString("tokenId");
        } else {
            strOptString = null;
        }
        if (jSONObject.has("email")) {
            strOptString2 = jSONObject.optString("email");
        } else {
            strOptString2 = null;
        }
        if (jSONObject.has("displayName")) {
            strOptString3 = jSONObject.optString("displayName");
        } else {
            strOptString3 = null;
        }
        if (jSONObject.has("givenName")) {
            strOptString4 = jSONObject.optString("givenName");
        } else {
            strOptString4 = null;
        }
        if (jSONObject.has("familyName")) {
            strOptString5 = jSONObject.optString("familyName");
        } else {
            strOptString5 = null;
        }
        GoogleSignInAccount googleSignInAccountP1 = P1(strOptString8, strOptString, strOptString2, strOptString3, strOptString4, strOptString5, uri, Long.valueOf(j10), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        if (jSONObject.has("serverAuthCode")) {
            strOptString6 = jSONObject.optString("serverAuthCode");
        }
        googleSignInAccountP1.f65529g = strOptString6;
        return googleSignInAccountP1;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 1, this.f65523a);
        C15708b.w(parcel, 2, U0(), false);
        C15708b.w(parcel, 3, d1(), false);
        C15708b.w(parcel, 4, b0(), false);
        C15708b.w(parcel, 5, T(), false);
        C15708b.u(parcel, 6, h1(), i10, false);
        C15708b.w(parcel, 7, y1(), false);
        C15708b.s(parcel, 8, this.f65530h);
        C15708b.w(parcel, 9, this.f65531i, false);
        C15708b.A(parcel, 10, this.f65532j, false);
        C15708b.w(parcel, 11, I0(), false);
        C15708b.w(parcel, 12, r0(), false);
        C15708b.b(parcel, iA);
    }
}
