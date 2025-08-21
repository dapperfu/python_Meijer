package com.google.firebase.components;

import df.C13676c;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes8.dex */
public class DependencyCycleException extends DependencyException {

    /* renamed from: a, reason: collision with root package name */
    private final List<C13676c<?>> f89469a;

    public DependencyCycleException(List<C13676c<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f89469a = list;
    }
}
