package io.constructor.data;

import com.squareup.moshi.t;
import gv.InterfaceC14411a;
import io.constructor.data.remote.ConstructorApi;
import xu.InterfaceC18226d;

/* loaded from: classes6.dex */
public final class DataManager_Factory implements InterfaceC18226d {
    private final InterfaceC14411a<ConstructorApi> constructorApiProvider;
    private final InterfaceC14411a<t> moshiProvider;

    public static DataManager_Factory create(InterfaceC14411a<ConstructorApi> interfaceC14411a, InterfaceC14411a<t> interfaceC14411a2) {
        return new DataManager_Factory(interfaceC14411a, interfaceC14411a2);
    }

    public static DataManager newInstance(ConstructorApi constructorApi, t tVar) {
        return new DataManager(constructorApi, tVar);
    }

    @Override // gv.InterfaceC14411a
    public DataManager get() {
        return newInstance(this.constructorApiProvider.get(), this.moshiProvider.get());
    }

    public DataManager_Factory(InterfaceC14411a<ConstructorApi> interfaceC14411a, InterfaceC14411a<t> interfaceC14411a2) {
        this.constructorApiProvider = interfaceC14411a;
        this.moshiProvider = interfaceC14411a2;
    }
}
