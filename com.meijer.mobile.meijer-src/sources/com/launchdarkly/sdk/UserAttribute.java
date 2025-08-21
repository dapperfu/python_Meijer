package com.launchdarkly.sdk;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import og.InterfaceC16126b;

@InterfaceC16126b(UserAttributeTypeAdapter.class)
@Deprecated
/* loaded from: classes8.dex */
public final class UserAttribute implements com.launchdarkly.sdk.json.c {

    /* renamed from: c, reason: collision with root package name */
    public static final UserAttribute f91850c;

    /* renamed from: d, reason: collision with root package name */
    public static final UserAttribute f91851d;

    /* renamed from: e, reason: collision with root package name */
    public static final UserAttribute f91852e;

    /* renamed from: f, reason: collision with root package name */
    public static final UserAttribute f91853f;

    /* renamed from: g, reason: collision with root package name */
    public static final UserAttribute f91854g;

    /* renamed from: h, reason: collision with root package name */
    public static final UserAttribute f91855h;

    /* renamed from: i, reason: collision with root package name */
    public static final UserAttribute f91856i;

    /* renamed from: j, reason: collision with root package name */
    public static final UserAttribute f91857j;

    /* renamed from: k, reason: collision with root package name */
    public static final UserAttribute f91858k;

    /* renamed from: l, reason: collision with root package name */
    static final Map<String, UserAttribute> f91859l;

    /* renamed from: m, reason: collision with root package name */
    static final UserAttribute[] f91860m;

    /* renamed from: a, reason: collision with root package name */
    private final String f91861a;

    /* renamed from: b, reason: collision with root package name */
    final com.launchdarkly.sdk.f<com.launchdarkly.sdk.h, LDValue> f91862b;

    @Deprecated
    static final class UserAttributeTypeAdapter extends TypeAdapter<UserAttribute> {
        @Override // com.google.gson.TypeAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public UserAttribute read(JsonReader jsonReader) throws IOException {
            if (a.f91863a[jsonReader.peek().ordinal()] == 1) {
                return UserAttribute.a(jsonReader.nextString());
            }
            throw new IllegalStateException("expected string for UserAttribute");
        }

        UserAttributeTypeAdapter() {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(JsonWriter jsonWriter, UserAttribute userAttribute) throws IOException {
            jsonWriter.value(userAttribute.b());
        }
    }

    static class b implements com.launchdarkly.sdk.f<com.launchdarkly.sdk.h, LDValue> {
        @Override // com.launchdarkly.sdk.f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public LDValue apply(com.launchdarkly.sdk.h hVar) {
            return hVar.f92148a;
        }

        b() {
        }
    }

    static class c implements com.launchdarkly.sdk.f<com.launchdarkly.sdk.h, LDValue> {
        @Override // com.launchdarkly.sdk.f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public LDValue apply(com.launchdarkly.sdk.h hVar) {
            return hVar.f92149b;
        }

        c() {
        }
    }

    static class d implements com.launchdarkly.sdk.f<com.launchdarkly.sdk.h, LDValue> {
        @Override // com.launchdarkly.sdk.f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public LDValue apply(com.launchdarkly.sdk.h hVar) {
            return hVar.f92150c;
        }

        d() {
        }
    }

    static class e implements com.launchdarkly.sdk.f<com.launchdarkly.sdk.h, LDValue> {
        @Override // com.launchdarkly.sdk.f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public LDValue apply(com.launchdarkly.sdk.h hVar) {
            return hVar.f92151d;
        }

        e() {
        }
    }

    static class f implements com.launchdarkly.sdk.f<com.launchdarkly.sdk.h, LDValue> {
        @Override // com.launchdarkly.sdk.f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public LDValue apply(com.launchdarkly.sdk.h hVar) {
            return hVar.f92152e;
        }

        f() {
        }
    }

    static class g implements com.launchdarkly.sdk.f<com.launchdarkly.sdk.h, LDValue> {
        @Override // com.launchdarkly.sdk.f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public LDValue apply(com.launchdarkly.sdk.h hVar) {
            return hVar.f92153f;
        }

        g() {
        }
    }

    static class h implements com.launchdarkly.sdk.f<com.launchdarkly.sdk.h, LDValue> {
        @Override // com.launchdarkly.sdk.f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public LDValue apply(com.launchdarkly.sdk.h hVar) {
            return hVar.f92154g;
        }

        h() {
        }
    }

    static class i implements com.launchdarkly.sdk.f<com.launchdarkly.sdk.h, LDValue> {
        @Override // com.launchdarkly.sdk.f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public LDValue apply(com.launchdarkly.sdk.h hVar) {
            return hVar.f92156i;
        }

        i() {
        }
    }

    static class j implements com.launchdarkly.sdk.f<com.launchdarkly.sdk.h, LDValue> {
        @Override // com.launchdarkly.sdk.f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public LDValue apply(com.launchdarkly.sdk.h hVar) {
            return LDValue.t(hVar.f92155h);
        }

        j() {
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f91863a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f91863a = iArr;
            try {
                iArr[JsonToken.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    static {
        UserAttribute userAttribute = new UserAttribute("key", new b());
        f91850c = userAttribute;
        UserAttribute userAttribute2 = new UserAttribute("ip", new c());
        f91851d = userAttribute2;
        UserAttribute userAttribute3 = new UserAttribute("email", new d());
        f91852e = userAttribute3;
        UserAttribute userAttribute4 = new UserAttribute("name", new e());
        f91853f = userAttribute4;
        UserAttribute userAttribute5 = new UserAttribute("avatar", new f());
        f91854g = userAttribute5;
        UserAttribute userAttribute6 = new UserAttribute("firstName", new g());
        f91855h = userAttribute6;
        UserAttribute userAttribute7 = new UserAttribute("lastName", new h());
        f91856i = userAttribute7;
        UserAttribute userAttribute8 = new UserAttribute(PlaceTypes.COUNTRY, new i());
        f91857j = userAttribute8;
        UserAttribute userAttribute9 = new UserAttribute("anonymous", new j());
        f91858k = userAttribute9;
        f91859l = new HashMap();
        UserAttribute[] userAttributeArr = {userAttribute, userAttribute2, userAttribute3, userAttribute4, userAttribute5, userAttribute6, userAttribute7, userAttribute8, userAttribute9};
        for (int i10 = 0; i10 < 9; i10++) {
            UserAttribute userAttribute10 = userAttributeArr[i10];
            f91859l.put(userAttribute10.b(), userAttribute10);
        }
        f91860m = new UserAttribute[]{f91851d, f91852e, f91853f, f91854g, f91855h, f91856i, f91857j};
    }

    public static UserAttribute a(String str) {
        UserAttribute userAttribute = f91859l.get(str);
        return userAttribute != null ? userAttribute : new UserAttribute(str, null);
    }

    public String b() {
        return this.f91861a;
    }

    public boolean c() {
        return this.f91862b != null;
    }

    public boolean equals(Object obj) {
        if (obj instanceof UserAttribute) {
            UserAttribute userAttribute = (UserAttribute) obj;
            if (!c() && !userAttribute.c()) {
                return this.f91861a.equals(userAttribute.f91861a);
            }
            if (this == userAttribute) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return this.f91861a;
    }

    private UserAttribute(String str, com.launchdarkly.sdk.f<com.launchdarkly.sdk.h, LDValue> fVar) {
        this.f91861a = str;
        this.f91862b = fVar;
    }

    public int hashCode() {
        if (c()) {
            return super.hashCode();
        }
        return this.f91861a.hashCode();
    }
}
