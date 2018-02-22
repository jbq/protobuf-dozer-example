/*
 *  Copyright 2009-2018 the original author or authors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an
 *  "AS IS" BASIS,  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *  either express or implied. See the License for the specific language
 *  governing permissions and limitations under the License.
 */

package de.pascalbrokmeier;

import org.dozer.DozerBeanMapperBuilder;
import org.dozer.Mapper;

/**
 * Helper class that converts all types forth and back between PB versions and powerTAC originals
 */
public class GRPCTypeConverter {

    private Mapper mapper;


    public GRPCTypeConverter() {
        mapper = DozerBeanMapperBuilder
                .create()
                .withMappingFiles("dozer-mappings.xml")
                .build();
    }

    public <T> T convertGeneric(Object source, Class<T> dc) {
        return mapper.map(source, dc);
    }

    public void convertGeneric(Object source, Object dest) {
        mapper.map(source, dest);
    }


}

