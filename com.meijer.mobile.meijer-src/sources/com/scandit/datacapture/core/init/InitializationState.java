package com.scandit.datacapture.core.init;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/scandit/datacapture/core/init/InitializationState;", "", "NOT_YET_INITIALIZED", "INITIALIZED", "ERROR_INITIALIZING", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class InitializationState {
    public static final InitializationState ERROR_INITIALIZING;
    public static final InitializationState INITIALIZED;
    public static final InitializationState NOT_YET_INITIALIZED;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ InitializationState[] f125154a;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f125155b;

    public static EnumEntries<InitializationState> getEntries() {
        return f125155b;
    }

    public static InitializationState valueOf(String str) {
        return (InitializationState) Enum.valueOf(InitializationState.class, str);
    }

    public static InitializationState[] values() {
        return (InitializationState[]) f125154a.clone();
    }

    static {
        InitializationState initializationState = new InitializationState("NOT_YET_INITIALIZED", 0);
        NOT_YET_INITIALIZED = initializationState;
        InitializationState initializationState2 = new InitializationState("INITIALIZED", 1);
        INITIALIZED = initializationState2;
        InitializationState initializationState3 = new InitializationState("ERROR_INITIALIZING", 2);
        ERROR_INITIALIZING = initializationState3;
        InitializationState[] initializationStateArr = {initializationState, initializationState2, initializationState3};
        f125154a = initializationStateArr;
        f125155b = EnumEntriesKt.a(initializationStateArr);
    }

    private InitializationState(String str, int i10) {
    }
}
