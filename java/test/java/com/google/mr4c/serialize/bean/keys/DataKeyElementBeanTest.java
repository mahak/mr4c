/**
  * Copyright 2014 Google Inc. All rights reserved.
  * 
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
  * You may obtain a copy of the License at
  * 
  *     http://www.apache.org/licenses/LICENSE-2.0
  * 
  * Unless required by applicable law or agreed to in writing, software
  * distributed under the License is distributed on an "AS IS" BASIS,
  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  * See the License for the specific language governing permissions and
  * limitations under the License.
*/

package com.google.mr4c.serialize.bean.keys;

import com.google.mr4c.keys.DataKeyDimension;
import com.google.mr4c.keys.DataKeyElement;

import org.junit.*;
import static org.junit.Assert.*;

public class DataKeyElementBeanTest {

	private DataKeyElement m_element;

	@Before public void setUp() {
		m_element = new DataKeyElement("some_value",
			new DataKeyDimension("some_dimension")
		);
	} 

	@Test public void testRoundTrip() {
		DataKeyElementBean bean = DataKeyElementBean.instance(m_element);
		DataKeyElement element2 = bean.toKeyElement();
		assertEquals(m_element, element2);
	}

}
