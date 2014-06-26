/*
 * Copyright 2014 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jboss.windup.config.operation.iteration;

import org.jboss.windup.graph.model.WindupVertexFrame;

/**
 * @author <a href="mailto:lincolnbaxter@gmail.com">Lincoln Baxter, III</a>
 * 
 */
public interface IterationBuilderOver
{
    /**
     * Sets the name and type of the variable for this iteration's "current element".
     * The type server for automatic type check.
     */
    public IterationBuilderVar var(Class<? extends WindupVertexFrame> varType, String var);

    /**
     * Sets the name of the variable for this iteration's "current element".
     */
    public IterationBuilderVar var(String var);

    /**
     * Starts a gremlin query part; the query result is stored under given var name.
     * Refer to Gremlin Pipes for the subsequent API.
     */
    public GremlinPipesQuery queryFor(Class<? extends WindupVertexFrame> varType, String var);

    /**
     * Starts a gremlin query part; the query result is stored under given var name.
     * Refer to Gremlin Pipes for the subsequent API.
     */
    public GremlinPipesQuery queryFor(String var);
}
